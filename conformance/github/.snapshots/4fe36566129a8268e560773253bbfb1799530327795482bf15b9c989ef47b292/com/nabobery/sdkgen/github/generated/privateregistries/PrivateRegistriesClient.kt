package com.nabobery.sdkgen.github.generated.privateregistries

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155
import com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027
import com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPostRequestJsonXb176602d
import com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a
import com.nabobery.sdkgen.github.generated.OrgPrivateRegistryConfiguration
import com.nabobery.sdkgen.github.generated.OrgPrivateRegistryConfigurationWithSelectedRepositories
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

internal object PrivateRegistriesCodecs {
  internal const val PRIVATEREGISTRIESCREATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID: String =
      "private-registries/create-org-private-registry.request"

  private val privateRegistriesCreateOrgPrivateRegistryRequestCodec:
      MediaTypeCodec<InlineOrgsPrivateRegistriesPostRequestJsonXb176602d> =
      KotlinxSerializationCodec(PRIVATEREGISTRIESCREATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID, InlineOrgsPrivateRegistriesPostRequestJsonXb176602d.Serializer, SdkJson)

  internal const val PRIVATEREGISTRIESCREATEORGPRIVATEREGISTRY_RESPONSE_CODEC_ID: String =
      "private-registries/create-org-private-registry.response"

  private val privateRegistriesCreateOrgPrivateRegistryResponseCodec:
      MediaTypeCodec<OrgPrivateRegistryConfigurationWithSelectedRepositories> =
      KotlinxSerializationCodec(PRIVATEREGISTRIESCREATEORGPRIVATEREGISTRY_RESPONSE_CODEC_ID, OrgPrivateRegistryConfigurationWithSelectedRepositories.Serializer, SdkJson)

  private val privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative0Codec:
      MediaTypeCodec<OrgPrivateRegistryConfigurationWithSelectedRepositories> =
      KotlinxSerializationCodec("private-registries/create-org-private-registry.response.alternative0", OrgPrivateRegistryConfigurationWithSelectedRepositories.Serializer, SdkJson)

  internal val privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrgPrivateRegistryConfigurationWithSelectedRepositories> =
      MediaTypeCodecRegistry.of(privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative0Codec)

  private val privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/create-org-private-registry.response.alternative1", BasicError.Serializer, SdkJson)

  internal val privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative1Codec)

  private val privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("private-registries/create-org-private-registry.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative2Codec)

  internal val privateRegistriesCreateOrgPrivateRegistryRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsPrivateRegistriesPostRequestJsonXb176602d> =
      MediaTypeCodecRegistry.of(privateRegistriesCreateOrgPrivateRegistryRequestCodec)

  internal val privateRegistriesCreateOrgPrivateRegistryResponseCodecRegistry:
      MediaTypeCodecRegistry<OrgPrivateRegistryConfigurationWithSelectedRepositories> =
      MediaTypeCodecRegistry.of(privateRegistriesCreateOrgPrivateRegistryResponseCodec)

  private val privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/delete-org-private-registry.response.alternative1", BasicError.Serializer, SdkJson)

  internal val privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative1Codec)

  private val privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("private-registries/delete-org-private-registry.response.alternative2", ScimError.Serializer, SdkJson)

  internal val privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative2Codec)

  private val privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/delete-org-private-registry.response.alternative3", BasicError.Serializer, SdkJson)

  internal val privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative3Codec)

  internal val privateRegistriesDeleteOrgPrivateRegistryRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val privateRegistriesDeleteOrgPrivateRegistryResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val PRIVATEREGISTRIESGETORGPRIVATEREGISTRY_RESPONSE_CODEC_ID: String =
      "private-registries/get-org-private-registry.response"

  private val privateRegistriesGetOrgPrivateRegistryResponseCodec:
      MediaTypeCodec<OrgPrivateRegistryConfiguration> =
      KotlinxSerializationCodec(PRIVATEREGISTRIESGETORGPRIVATEREGISTRY_RESPONSE_CODEC_ID, OrgPrivateRegistryConfiguration.Serializer, SdkJson)

  private val privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative0Codec:
      MediaTypeCodec<OrgPrivateRegistryConfiguration> =
      KotlinxSerializationCodec("private-registries/get-org-private-registry.response.alternative0", OrgPrivateRegistryConfiguration.Serializer, SdkJson)

  internal val privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrgPrivateRegistryConfiguration> =
      MediaTypeCodecRegistry.of(privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative0Codec)

  private val privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/get-org-private-registry.response.alternative1", BasicError.Serializer, SdkJson)

  internal val privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative1Codec)

  internal val privateRegistriesGetOrgPrivateRegistryRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val privateRegistriesGetOrgPrivateRegistryResponseCodecRegistry:
      MediaTypeCodecRegistry<OrgPrivateRegistryConfiguration> =
      MediaTypeCodecRegistry.of(privateRegistriesGetOrgPrivateRegistryResponseCodec)

  internal const val PRIVATEREGISTRIESGETORGPUBLICKEY_RESPONSE_CODEC_ID: String =
      "private-registries/get-org-public-key.response"

  private val privateRegistriesGetOrgPublicKeyResponseCodec:
      MediaTypeCodec<InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a> =
      KotlinxSerializationCodec(PRIVATEREGISTRIESGETORGPUBLICKEY_RESPONSE_CODEC_ID, InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a.Serializer, SdkJson)

  private val privateRegistriesGetOrgPublicKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a> =
      KotlinxSerializationCodec("private-registries/get-org-public-key.response.alternative0", InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a.Serializer, SdkJson)

  internal val privateRegistriesGetOrgPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a> =
      MediaTypeCodecRegistry.of(privateRegistriesGetOrgPublicKeyResponseCodecAlternative0Codec)

  private val privateRegistriesGetOrgPublicKeyResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/get-org-public-key.response.alternative1", BasicError.Serializer, SdkJson)

  internal val privateRegistriesGetOrgPublicKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesGetOrgPublicKeyResponseCodecAlternative1Codec)

  internal val privateRegistriesGetOrgPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val privateRegistriesGetOrgPublicKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a> =
      MediaTypeCodecRegistry.of(privateRegistriesGetOrgPublicKeyResponseCodec)

  internal const val PRIVATEREGISTRIESLISTORGPRIVATEREGISTRIES_RESPONSE_CODEC_ID: String =
      "private-registries/list-org-private-registries.response"

  private val privateRegistriesListOrgPrivateRegistriesResponseCodec:
      MediaTypeCodec<InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155> =
      KotlinxSerializationCodec(PRIVATEREGISTRIESLISTORGPRIVATEREGISTRIES_RESPONSE_CODEC_ID, InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155.Serializer, SdkJson)

  private val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155> =
      KotlinxSerializationCodec("private-registries/list-org-private-registries.response.alternative0", InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155.Serializer, SdkJson)

  internal val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155> =
      MediaTypeCodecRegistry.of(privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative0Codec)

  private val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/list-org-private-registries.response.alternative1", BasicError.Serializer, SdkJson)

  internal val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative1Codec)

  private val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("private-registries/list-org-private-registries.response.alternative2", ScimError.Serializer, SdkJson)

  internal val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative2Codec)

  private val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/list-org-private-registries.response.alternative3", BasicError.Serializer, SdkJson)

  internal val privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative3Codec)

  internal val privateRegistriesListOrgPrivateRegistriesRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val privateRegistriesListOrgPrivateRegistriesResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155> =
      MediaTypeCodecRegistry.of(privateRegistriesListOrgPrivateRegistriesResponseCodec)

  internal const val PRIVATEREGISTRIESUPDATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID: String =
      "private-registries/update-org-private-registry.request"

  private val privateRegistriesUpdateOrgPrivateRegistryRequestCodec:
      MediaTypeCodec<InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027> =
      KotlinxSerializationCodec(PRIVATEREGISTRIESUPDATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID, InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027.Serializer, SdkJson)

  private val privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("private-registries/update-org-private-registry.response.alternative1", BasicError.Serializer, SdkJson)

  internal val privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative1Codec)

  private val privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("private-registries/update-org-private-registry.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative2Codec)

  internal val privateRegistriesUpdateOrgPrivateRegistryRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027> =
      MediaTypeCodecRegistry.of(privateRegistriesUpdateOrgPrivateRegistryRequestCodec)

  internal val privateRegistriesUpdateOrgPrivateRegistryResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'private-registries' group of GitHub v3 REST API.
 */
public class PrivateRegistriesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@PrivateRegistriesClient.authentication)

  /**
   *
   * Creates a private registry configuration with an encrypted value for an organization. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   * For OIDC-based registries (`oidc_azure`, `oidc_aws`, `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp`), the
   * `encrypted_value` and `key_id` fields should be omitted.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PrivateRegistriesCreateOrgPrivateRegistryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PrivateRegistriesCreateOrgPrivateRegistryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun privateRegistriesCreateOrgPrivateRegistry(
    request: InlineOrgsPrivateRegistriesPostRequestJsonXb176602d,
    org: String,
    options: CallOptions = CallOptions(),
  ): OrgPrivateRegistryConfigurationWithSelectedRepositories = executor.executeWithTypedErrors<InlineOrgsPrivateRegistriesPostRequestJsonXb176602d, PrivateRegistriesCreateOrgPrivateRegistryResponse, OrgPrivateRegistryConfigurationWithSelectedRepositories>(
    request = SdkExecutionRequest(privateRegistriesCreateOrgPrivateRegistryMetadata, baseUri, request, listOf(PrivateRegistriesCodecs.PRIVATEREGISTRIESCREATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = PrivateRegistriesCodecs.privateRegistriesCreateOrgPrivateRegistryRequestCodecRegistry,
    responseDecoder = PrivateRegistriesCreateOrgPrivateRegistryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.SuccessJson -> response.json
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.Http404Json -> PrivateRegistriesCreateOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.Http422Json -> PrivateRegistriesCreateOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesCreateOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   * Creates a private registry configuration with an encrypted value for an organization. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   * For OIDC-based registries (`oidc_azure`, `oidc_aws`, `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp`), the
   * `encrypted_value` and `key_id` fields should be omitted.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun privateRegistriesCreateOrgPrivateRegistryWithResponse(
    request: InlineOrgsPrivateRegistriesPostRequestJsonXb176602d,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PrivateRegistriesCreateOrgPrivateRegistryResponse> = executor.executeWithResponse<InlineOrgsPrivateRegistriesPostRequestJsonXb176602d, PrivateRegistriesCreateOrgPrivateRegistryResponse>(SdkExecutionRequest(privateRegistriesCreateOrgPrivateRegistryMetadata, baseUri, request, listOf(PrivateRegistriesCodecs.PRIVATEREGISTRIESCREATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), PrivateRegistriesCodecs.privateRegistriesCreateOrgPrivateRegistryRequestCodecRegistry, PrivateRegistriesCreateOrgPrivateRegistryResponseDecoder, options)

  /**
   *
   * Delete a private registry configuration at the organization-level.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws PrivateRegistriesDeleteOrgPrivateRegistryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PrivateRegistriesDeleteOrgPrivateRegistryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun privateRegistriesDeleteOrgPrivateRegistry(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PrivateRegistriesDeleteOrgPrivateRegistryResponse, Unit>(
    request = SdkExecutionRequest(privateRegistriesDeleteOrgPrivateRegistryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = PrivateRegistriesCodecs.privateRegistriesDeleteOrgPrivateRegistryRequestCodecRegistry,
    responseDecoder = PrivateRegistriesDeleteOrgPrivateRegistryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.SuccessNoContent -> response.unit
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http400Json -> PrivateRegistriesDeleteOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http400ScimJson -> PrivateRegistriesDeleteOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http404Json -> PrivateRegistriesDeleteOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesDeleteOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   * Delete a private registry configuration at the organization-level.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun privateRegistriesDeleteOrgPrivateRegistryWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PrivateRegistriesDeleteOrgPrivateRegistryResponse> = executor.executeWithResponse<Unit, PrivateRegistriesDeleteOrgPrivateRegistryResponse>(SdkExecutionRequest(privateRegistriesDeleteOrgPrivateRegistryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), PrivateRegistriesCodecs.privateRegistriesDeleteOrgPrivateRegistryRequestCodecRegistry, PrivateRegistriesDeleteOrgPrivateRegistryResponseDecoder, options)

  /**
   *
   * Get the configuration of a single private registry defined for an organization, omitting its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PrivateRegistriesGetOrgPrivateRegistryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PrivateRegistriesGetOrgPrivateRegistryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun privateRegistriesGetOrgPrivateRegistry(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): OrgPrivateRegistryConfiguration = executor.executeWithTypedErrors<Unit, PrivateRegistriesGetOrgPrivateRegistryResponse, OrgPrivateRegistryConfiguration>(
    request = SdkExecutionRequest(privateRegistriesGetOrgPrivateRegistryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = PrivateRegistriesCodecs.privateRegistriesGetOrgPrivateRegistryRequestCodecRegistry,
    responseDecoder = PrivateRegistriesGetOrgPrivateRegistryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PrivateRegistriesGetOrgPrivateRegistryResponse.SuccessJson -> response.json
        is PrivateRegistriesGetOrgPrivateRegistryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesGetOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PrivateRegistriesGetOrgPrivateRegistryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PrivateRegistriesGetOrgPrivateRegistryResponse.Http404Json -> PrivateRegistriesGetOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesGetOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   * Get the configuration of a single private registry defined for an organization, omitting its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun privateRegistriesGetOrgPrivateRegistryWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PrivateRegistriesGetOrgPrivateRegistryResponse> = executor.executeWithResponse<Unit, PrivateRegistriesGetOrgPrivateRegistryResponse>(SdkExecutionRequest(privateRegistriesGetOrgPrivateRegistryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), PrivateRegistriesCodecs.privateRegistriesGetOrgPrivateRegistryRequestCodecRegistry, PrivateRegistriesGetOrgPrivateRegistryResponseDecoder, options)

  /**
   *
   * Gets the org public key, which is needed to encrypt private registry secrets. You need to encrypt a secret before
   * you can create or update secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PrivateRegistriesGetOrgPublicKeyApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PrivateRegistriesGetOrgPublicKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun privateRegistriesGetOrgPublicKey(org: String, options: CallOptions = CallOptions()): InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a = executor.executeWithTypedErrors<Unit, PrivateRegistriesGetOrgPublicKeyResponse, InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a>(
    request = SdkExecutionRequest(privateRegistriesGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = PrivateRegistriesCodecs.privateRegistriesGetOrgPublicKeyRequestCodecRegistry,
    responseDecoder = PrivateRegistriesGetOrgPublicKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PrivateRegistriesGetOrgPublicKeyResponse.SuccessJson -> response.json
        is PrivateRegistriesGetOrgPublicKeyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesGetOrgPublicKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PrivateRegistriesGetOrgPublicKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PrivateRegistriesGetOrgPublicKeyResponse.Http404Json -> PrivateRegistriesGetOrgPublicKeyApiException(response, statusCode, headers)
        is PrivateRegistriesGetOrgPublicKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   * Gets the org public key, which is needed to encrypt private registry secrets. You need to encrypt a secret before
   * you can create or update secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun privateRegistriesGetOrgPublicKeyWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<PrivateRegistriesGetOrgPublicKeyResponse> = executor.executeWithResponse<Unit, PrivateRegistriesGetOrgPublicKeyResponse>(SdkExecutionRequest(privateRegistriesGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), PrivateRegistriesCodecs.privateRegistriesGetOrgPublicKeyRequestCodecRegistry, PrivateRegistriesGetOrgPublicKeyResponseDecoder, options)

  /**
   *
   * Lists all private registry configurations available at the organization-level without revealing their encrypted
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
   * @throws PrivateRegistriesListOrgPrivateRegistriesApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PrivateRegistriesListOrgPrivateRegistriesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun privateRegistriesListOrgPrivateRegistries(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 = executor.executeWithTypedErrors<Unit, PrivateRegistriesListOrgPrivateRegistriesResponse, InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155>(
    request = SdkExecutionRequest(privateRegistriesListOrgPrivateRegistriesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PrivateRegistriesCodecs.privateRegistriesListOrgPrivateRegistriesRequestCodecRegistry,
    responseDecoder = PrivateRegistriesListOrgPrivateRegistriesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PrivateRegistriesListOrgPrivateRegistriesResponse.SuccessJson -> response.json
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PrivateRegistriesListOrgPrivateRegistriesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Http400Json -> PrivateRegistriesListOrgPrivateRegistriesApiException(response, statusCode, headers)
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Http400ScimJson -> PrivateRegistriesListOrgPrivateRegistriesApiException(response, statusCode, headers)
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Http404Json -> PrivateRegistriesListOrgPrivateRegistriesApiException(response, statusCode, headers)
        is PrivateRegistriesListOrgPrivateRegistriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   * Lists all private registry configurations available at the organization-level without revealing their encrypted
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
  public suspend fun privateRegistriesListOrgPrivateRegistriesWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PrivateRegistriesListOrgPrivateRegistriesResponse> = executor.executeWithResponse<Unit, PrivateRegistriesListOrgPrivateRegistriesResponse>(SdkExecutionRequest(privateRegistriesListOrgPrivateRegistriesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), PrivateRegistriesCodecs.privateRegistriesListOrgPrivateRegistriesRequestCodecRegistry, PrivateRegistriesListOrgPrivateRegistriesResponseDecoder, options)

  /**
   *
   * Updates a private registry configuration with an encrypted value for an organization. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   * For OIDC-based registries (`oidc_azure`, `oidc_aws`, `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp`), the
   * `encrypted_value` and `key_id` fields should be omitted.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws PrivateRegistriesUpdateOrgPrivateRegistryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PrivateRegistriesUpdateOrgPrivateRegistryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun privateRegistriesUpdateOrgPrivateRegistry(
    request: InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027, PrivateRegistriesUpdateOrgPrivateRegistryResponse, Unit>(
    request = SdkExecutionRequest(privateRegistriesUpdateOrgPrivateRegistryMetadata, baseUri, request, listOf(PrivateRegistriesCodecs.PRIVATEREGISTRIESUPDATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = PrivateRegistriesCodecs.privateRegistriesUpdateOrgPrivateRegistryRequestCodecRegistry,
    responseDecoder = PrivateRegistriesUpdateOrgPrivateRegistryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.SuccessNoContent -> response.unit
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.Http404Json -> PrivateRegistriesUpdateOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.Http422Json -> PrivateRegistriesUpdateOrgPrivateRegistryApiException(response, statusCode, headers)
        is PrivateRegistriesUpdateOrgPrivateRegistryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   * Updates a private registry configuration with an encrypted value for an organization. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   * For OIDC-based registries (`oidc_azure`, `oidc_aws`, `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp`), the
   * `encrypted_value` and `key_id` fields should be omitted.
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
  public suspend fun privateRegistriesUpdateOrgPrivateRegistryWithResponse(
    request: InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PrivateRegistriesUpdateOrgPrivateRegistryResponse> = executor.executeWithResponse<InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027, PrivateRegistriesUpdateOrgPrivateRegistryResponse>(SdkExecutionRequest(privateRegistriesUpdateOrgPrivateRegistryMetadata, baseUri, request, listOf(PrivateRegistriesCodecs.PRIVATEREGISTRIESUPDATEORGPRIVATEREGISTRY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), PrivateRegistriesCodecs.privateRegistriesUpdateOrgPrivateRegistryRequestCodecRegistry, PrivateRegistriesUpdateOrgPrivateRegistryResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `private-registries/create-org-private-registry` may expose through
   * its typed API exception.
   */
  public sealed interface PrivateRegistriesCreateOrgPrivateRegistryError

  /**
   * Typed response alternatives for `private-registries/create-org-private-registry`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PrivateRegistriesCreateOrgPrivateRegistryResponse {
    public class SuccessJson(
      public val json: OrgPrivateRegistryConfigurationWithSelectedRepositories,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesCreateOrgPrivateRegistryResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesCreateOrgPrivateRegistryResponse,
        PrivateRegistriesCreateOrgPrivateRegistryError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesCreateOrgPrivateRegistryResponse,
        PrivateRegistriesCreateOrgPrivateRegistryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesCreateOrgPrivateRegistryResponse
  }

  /**
   * Raised by `private-registries/create-org-private-registry` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PrivateRegistriesCreateOrgPrivateRegistryApiException(
    public val error: PrivateRegistriesCreateOrgPrivateRegistryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "private-registries/create-org-private-registry")

  private object PrivateRegistriesCreateOrgPrivateRegistryResponseDecoder : SdkResponseAlternativeDecoder<PrivateRegistriesCreateOrgPrivateRegistryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PrivateRegistriesCreateOrgPrivateRegistryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PrivateRegistriesCreateOrgPrivateRegistryResponse> = when {
      alternative.id == "private-registries/create-org-private-registry.response.alternative0" -> SdkResponseDecodeResult(
        value = PrivateRegistriesCreateOrgPrivateRegistryResponse.SuccessJson(
          json = PrivateRegistriesCodecs.privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative0Registry.select(listOf("private-registries/create-org-private-registry.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/create-org-private-registry.response.alternative1" -> SdkResponseDecodeResult(
        value = PrivateRegistriesCreateOrgPrivateRegistryResponse.Http404Json(
          json = PrivateRegistriesCodecs.privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative1Registry.select(listOf("private-registries/create-org-private-registry.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/create-org-private-registry.response.alternative2" -> SdkResponseDecodeResult(
        value = PrivateRegistriesCreateOrgPrivateRegistryResponse.Http422Json(
          json = PrivateRegistriesCodecs.privateRegistriesCreateOrgPrivateRegistryResponseCodecAlternative2Registry.select(listOf("private-registries/create-org-private-registry.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PrivateRegistriesCreateOrgPrivateRegistryResponse = PrivateRegistriesCreateOrgPrivateRegistryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `private-registries/delete-org-private-registry` may expose through
   * its typed API exception.
   */
  public sealed interface PrivateRegistriesDeleteOrgPrivateRegistryError

  /**
   * Typed response alternatives for `private-registries/delete-org-private-registry`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PrivateRegistriesDeleteOrgPrivateRegistryResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesDeleteOrgPrivateRegistryResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesDeleteOrgPrivateRegistryResponse,
        PrivateRegistriesDeleteOrgPrivateRegistryError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesDeleteOrgPrivateRegistryResponse,
        PrivateRegistriesDeleteOrgPrivateRegistryError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesDeleteOrgPrivateRegistryResponse,
        PrivateRegistriesDeleteOrgPrivateRegistryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesDeleteOrgPrivateRegistryResponse
  }

  /**
   * Raised by `private-registries/delete-org-private-registry` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PrivateRegistriesDeleteOrgPrivateRegistryApiException(
    public val error: PrivateRegistriesDeleteOrgPrivateRegistryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "private-registries/delete-org-private-registry")

  private object PrivateRegistriesDeleteOrgPrivateRegistryResponseDecoder : SdkResponseAlternativeDecoder<PrivateRegistriesDeleteOrgPrivateRegistryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PrivateRegistriesDeleteOrgPrivateRegistryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PrivateRegistriesDeleteOrgPrivateRegistryResponse> = when {
      alternative.id == "private-registries/delete-org-private-registry.response.alternative0" -> SdkResponseDecodeResult(
        value = PrivateRegistriesDeleteOrgPrivateRegistryResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/delete-org-private-registry.response.alternative1" -> SdkResponseDecodeResult(
        value = PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http400Json(
          json = PrivateRegistriesCodecs.privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative1Registry.select(listOf("private-registries/delete-org-private-registry.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/delete-org-private-registry.response.alternative2" -> SdkResponseDecodeResult(
        value = PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http400ScimJson(
          json = PrivateRegistriesCodecs.privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative2Registry.select(listOf("private-registries/delete-org-private-registry.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/delete-org-private-registry.response.alternative3" -> SdkResponseDecodeResult(
        value = PrivateRegistriesDeleteOrgPrivateRegistryResponse.Http404Json(
          json = PrivateRegistriesCodecs.privateRegistriesDeleteOrgPrivateRegistryResponseCodecAlternative3Registry.select(listOf("private-registries/delete-org-private-registry.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PrivateRegistriesDeleteOrgPrivateRegistryResponse = PrivateRegistriesDeleteOrgPrivateRegistryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `private-registries/get-org-private-registry` may expose through its
   * typed API exception.
   */
  public sealed interface PrivateRegistriesGetOrgPrivateRegistryError

  /**
   * Typed response alternatives for `private-registries/get-org-private-registry`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PrivateRegistriesGetOrgPrivateRegistryResponse {
    public class SuccessJson(
      public val json: OrgPrivateRegistryConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesGetOrgPrivateRegistryResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesGetOrgPrivateRegistryResponse,
        PrivateRegistriesGetOrgPrivateRegistryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesGetOrgPrivateRegistryResponse
  }

  /**
   * Raised by `private-registries/get-org-private-registry` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class PrivateRegistriesGetOrgPrivateRegistryApiException(
    public val error: PrivateRegistriesGetOrgPrivateRegistryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "private-registries/get-org-private-registry")

  private object PrivateRegistriesGetOrgPrivateRegistryResponseDecoder : SdkResponseAlternativeDecoder<PrivateRegistriesGetOrgPrivateRegistryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PrivateRegistriesGetOrgPrivateRegistryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PrivateRegistriesGetOrgPrivateRegistryResponse> = when {
      alternative.id == "private-registries/get-org-private-registry.response.alternative0" -> SdkResponseDecodeResult(
        value = PrivateRegistriesGetOrgPrivateRegistryResponse.SuccessJson(
          json = PrivateRegistriesCodecs.privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative0Registry.select(listOf("private-registries/get-org-private-registry.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/get-org-private-registry.response.alternative1" -> SdkResponseDecodeResult(
        value = PrivateRegistriesGetOrgPrivateRegistryResponse.Http404Json(
          json = PrivateRegistriesCodecs.privateRegistriesGetOrgPrivateRegistryResponseCodecAlternative1Registry.select(listOf("private-registries/get-org-private-registry.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PrivateRegistriesGetOrgPrivateRegistryResponse = PrivateRegistriesGetOrgPrivateRegistryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `private-registries/get-org-public-key` may expose through its typed
   * API exception.
   */
  public sealed interface PrivateRegistriesGetOrgPublicKeyError

  /**
   * Typed response alternatives for `private-registries/get-org-public-key`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PrivateRegistriesGetOrgPublicKeyResponse {
    public class SuccessJson(
      public val json: InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesGetOrgPublicKeyResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesGetOrgPublicKeyResponse,
        PrivateRegistriesGetOrgPublicKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesGetOrgPublicKeyResponse
  }

  /**
   * Raised by `private-registries/get-org-public-key` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class PrivateRegistriesGetOrgPublicKeyApiException(
    public val error: PrivateRegistriesGetOrgPublicKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "private-registries/get-org-public-key")

  private object PrivateRegistriesGetOrgPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<PrivateRegistriesGetOrgPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PrivateRegistriesGetOrgPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PrivateRegistriesGetOrgPublicKeyResponse> = when {
      alternative.id == "private-registries/get-org-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = PrivateRegistriesGetOrgPublicKeyResponse.SuccessJson(
          json = PrivateRegistriesCodecs.privateRegistriesGetOrgPublicKeyResponseCodecAlternative0Registry.select(listOf("private-registries/get-org-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/get-org-public-key.response.alternative1" -> SdkResponseDecodeResult(
        value = PrivateRegistriesGetOrgPublicKeyResponse.Http404Json(
          json = PrivateRegistriesCodecs.privateRegistriesGetOrgPublicKeyResponseCodecAlternative1Registry.select(listOf("private-registries/get-org-public-key.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PrivateRegistriesGetOrgPublicKeyResponse = PrivateRegistriesGetOrgPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `private-registries/list-org-private-registries` may expose through
   * its typed API exception.
   */
  public sealed interface PrivateRegistriesListOrgPrivateRegistriesError

  /**
   * Typed response alternatives for `private-registries/list-org-private-registries`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PrivateRegistriesListOrgPrivateRegistriesResponse {
    public class SuccessJson(
      public val json: InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesListOrgPrivateRegistriesResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesListOrgPrivateRegistriesResponse,
        PrivateRegistriesListOrgPrivateRegistriesError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesListOrgPrivateRegistriesResponse,
        PrivateRegistriesListOrgPrivateRegistriesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesListOrgPrivateRegistriesResponse,
        PrivateRegistriesListOrgPrivateRegistriesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesListOrgPrivateRegistriesResponse
  }

  /**
   * Raised by `private-registries/list-org-private-registries` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PrivateRegistriesListOrgPrivateRegistriesApiException(
    public val error: PrivateRegistriesListOrgPrivateRegistriesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "private-registries/list-org-private-registries")

  private object PrivateRegistriesListOrgPrivateRegistriesResponseDecoder : SdkResponseAlternativeDecoder<PrivateRegistriesListOrgPrivateRegistriesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PrivateRegistriesListOrgPrivateRegistriesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PrivateRegistriesListOrgPrivateRegistriesResponse> = when {
      alternative.id == "private-registries/list-org-private-registries.response.alternative0" -> SdkResponseDecodeResult(
        value = PrivateRegistriesListOrgPrivateRegistriesResponse.SuccessJson(
          json = PrivateRegistriesCodecs.privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative0Registry.select(listOf("private-registries/list-org-private-registries.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/list-org-private-registries.response.alternative1" -> SdkResponseDecodeResult(
        value = PrivateRegistriesListOrgPrivateRegistriesResponse.Http400Json(
          json = PrivateRegistriesCodecs.privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative1Registry.select(listOf("private-registries/list-org-private-registries.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/list-org-private-registries.response.alternative2" -> SdkResponseDecodeResult(
        value = PrivateRegistriesListOrgPrivateRegistriesResponse.Http400ScimJson(
          json = PrivateRegistriesCodecs.privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative2Registry.select(listOf("private-registries/list-org-private-registries.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/list-org-private-registries.response.alternative3" -> SdkResponseDecodeResult(
        value = PrivateRegistriesListOrgPrivateRegistriesResponse.Http404Json(
          json = PrivateRegistriesCodecs.privateRegistriesListOrgPrivateRegistriesResponseCodecAlternative3Registry.select(listOf("private-registries/list-org-private-registries.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PrivateRegistriesListOrgPrivateRegistriesResponse = PrivateRegistriesListOrgPrivateRegistriesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `private-registries/update-org-private-registry` may expose through
   * its typed API exception.
   */
  public sealed interface PrivateRegistriesUpdateOrgPrivateRegistryError

  /**
   * Typed response alternatives for `private-registries/update-org-private-registry`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PrivateRegistriesUpdateOrgPrivateRegistryResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesUpdateOrgPrivateRegistryResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesUpdateOrgPrivateRegistryResponse,
        PrivateRegistriesUpdateOrgPrivateRegistryError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesUpdateOrgPrivateRegistryResponse,
        PrivateRegistriesUpdateOrgPrivateRegistryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PrivateRegistriesUpdateOrgPrivateRegistryResponse
  }

  /**
   * Raised by `private-registries/update-org-private-registry` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PrivateRegistriesUpdateOrgPrivateRegistryApiException(
    public val error: PrivateRegistriesUpdateOrgPrivateRegistryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "private-registries/update-org-private-registry")

  private object PrivateRegistriesUpdateOrgPrivateRegistryResponseDecoder : SdkResponseAlternativeDecoder<PrivateRegistriesUpdateOrgPrivateRegistryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PrivateRegistriesUpdateOrgPrivateRegistryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PrivateRegistriesUpdateOrgPrivateRegistryResponse> = when {
      alternative.id == "private-registries/update-org-private-registry.response.alternative0" -> SdkResponseDecodeResult(
        value = PrivateRegistriesUpdateOrgPrivateRegistryResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/update-org-private-registry.response.alternative1" -> SdkResponseDecodeResult(
        value = PrivateRegistriesUpdateOrgPrivateRegistryResponse.Http404Json(
          json = PrivateRegistriesCodecs.privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative1Registry.select(listOf("private-registries/update-org-private-registry.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "private-registries/update-org-private-registry.response.alternative2" -> SdkResponseDecodeResult(
        value = PrivateRegistriesUpdateOrgPrivateRegistryResponse.Http422Json(
          json = PrivateRegistriesCodecs.privateRegistriesUpdateOrgPrivateRegistryResponseCodecAlternative2Registry.select(listOf("private-registries/update-org-private-registry.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PrivateRegistriesUpdateOrgPrivateRegistryResponse = PrivateRegistriesUpdateOrgPrivateRegistryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val privateRegistriesCreateOrgPrivateRegistryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "private-registries/create-org-private-registry",
          method = "POST",
          path = "/orgs/{org}/private-registries",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "OrgPrivateRegistryConfigurationWithSelectedRepositories",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/create-org-private-registry.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/create-org-private-registry.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/create-org-private-registry.response.alternative2",
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

    internal val privateRegistriesDeleteOrgPrivateRegistryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "private-registries/delete-org-private-registry",
          method = "DELETE",
          path = "/orgs/{org}/private-registries/{secret_name}",
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
              id = "private-registries/delete-org-private-registry.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/delete-org-private-registry.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/delete-org-private-registry.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/delete-org-private-registry.response.alternative3",
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

    internal val privateRegistriesGetOrgPrivateRegistryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "private-registries/get-org-private-registry",
          method = "GET",
          path = "/orgs/{org}/private-registries/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OrgPrivateRegistryConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/get-org-private-registry.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/get-org-private-registry.response.alternative1",
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

    internal val privateRegistriesGetOrgPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "private-registries/get-org-public-key",
          method = "GET",
          path = "/orgs/{org}/private-registries/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/get-org-public-key.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/get-org-public-key.response.alternative1",
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

    internal val privateRegistriesListOrgPrivateRegistriesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "private-registries/list-org-private-registries",
          method = "GET",
          path = "/orgs/{org}/private-registries",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/list-org-private-registries.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/list-org-private-registries.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/list-org-private-registries.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/list-org-private-registries.response.alternative3",
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

    internal val privateRegistriesUpdateOrgPrivateRegistryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "private-registries/update-org-private-registry",
          method = "PATCH",
          path = "/orgs/{org}/private-registries/{secret_name}",
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
              id = "private-registries/update-org-private-registry.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/update-org-private-registry.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "private-registries/update-org-private-registry.response.alternative2",
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
