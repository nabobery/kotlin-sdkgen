package com.nabobery.sdkgen.github.generated.hostedcompute

import com.nabobery.sdkgen.github.generated.InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29
import com.nabobery.sdkgen.github.generated.InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf
import com.nabobery.sdkgen.github.generated.InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6
import com.nabobery.sdkgen.github.generated.NetworkConfiguration
import com.nabobery.sdkgen.github.generated.NetworkSettings
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

internal object HostedComputeCodecs {
  internal const val HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID: String =
      "hosted-compute/create-network-configuration-for-org.request"

  private val hostedComputeCreateNetworkConfigurationForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6> =
      KotlinxSerializationCodec(HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID, InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6.Serializer, SdkJson)

  internal const val HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID: String =
      "hosted-compute/create-network-configuration-for-org.response"

  private val hostedComputeCreateNetworkConfigurationForOrgResponseCodec:
      MediaTypeCodec<NetworkConfiguration> =
      KotlinxSerializationCodec(HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID, NetworkConfiguration.Serializer, SdkJson)

  private val hostedComputeCreateNetworkConfigurationForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<NetworkConfiguration> =
      KotlinxSerializationCodec("hosted-compute/create-network-configuration-for-org.response.alternative0", NetworkConfiguration.Serializer, SdkJson)

  internal val hostedComputeCreateNetworkConfigurationForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<NetworkConfiguration> =
      MediaTypeCodecRegistry.of(hostedComputeCreateNetworkConfigurationForOrgResponseCodecAlternative0Codec)

  internal val hostedComputeCreateNetworkConfigurationForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6> =
      MediaTypeCodecRegistry.of(hostedComputeCreateNetworkConfigurationForOrgRequestCodec)

  internal val hostedComputeCreateNetworkConfigurationForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<NetworkConfiguration> =
      MediaTypeCodecRegistry.of(hostedComputeCreateNetworkConfigurationForOrgResponseCodec)

  internal val hostedComputeDeleteNetworkConfigurationFromOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val hostedComputeDeleteNetworkConfigurationFromOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val HOSTEDCOMPUTEGETNETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID: String =
      "hosted-compute/get-network-configuration-for-org.response"

  private val hostedComputeGetNetworkConfigurationForOrgResponseCodec:
      MediaTypeCodec<NetworkConfiguration> =
      KotlinxSerializationCodec(HOSTEDCOMPUTEGETNETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID, NetworkConfiguration.Serializer, SdkJson)

  private val hostedComputeGetNetworkConfigurationForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<NetworkConfiguration> =
      KotlinxSerializationCodec("hosted-compute/get-network-configuration-for-org.response.alternative0", NetworkConfiguration.Serializer, SdkJson)

  internal val hostedComputeGetNetworkConfigurationForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<NetworkConfiguration> =
      MediaTypeCodecRegistry.of(hostedComputeGetNetworkConfigurationForOrgResponseCodecAlternative0Codec)

  internal val hostedComputeGetNetworkConfigurationForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val hostedComputeGetNetworkConfigurationForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<NetworkConfiguration> =
      MediaTypeCodecRegistry.of(hostedComputeGetNetworkConfigurationForOrgResponseCodec)

  internal const val HOSTEDCOMPUTEGETNETWORKSETTINGSFORORG_RESPONSE_CODEC_ID: String =
      "hosted-compute/get-network-settings-for-org.response"

  private val hostedComputeGetNetworkSettingsForOrgResponseCodec: MediaTypeCodec<NetworkSettings> =
      KotlinxSerializationCodec(HOSTEDCOMPUTEGETNETWORKSETTINGSFORORG_RESPONSE_CODEC_ID, NetworkSettings.Serializer, SdkJson)

  private val hostedComputeGetNetworkSettingsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<NetworkSettings> =
      KotlinxSerializationCodec("hosted-compute/get-network-settings-for-org.response.alternative0", NetworkSettings.Serializer, SdkJson)

  internal val hostedComputeGetNetworkSettingsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<NetworkSettings> =
      MediaTypeCodecRegistry.of(hostedComputeGetNetworkSettingsForOrgResponseCodecAlternative0Codec)

  internal val hostedComputeGetNetworkSettingsForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val hostedComputeGetNetworkSettingsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<NetworkSettings> =
      MediaTypeCodecRegistry.of(hostedComputeGetNetworkSettingsForOrgResponseCodec)

  internal const val HOSTEDCOMPUTELISTNETWORKCONFIGURATIONSFORORG_RESPONSE_CODEC_ID: String =
      "hosted-compute/list-network-configurations-for-org.response"

  private val hostedComputeListNetworkConfigurationsForOrgResponseCodec:
      MediaTypeCodec<InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29> =
      KotlinxSerializationCodec(HOSTEDCOMPUTELISTNETWORKCONFIGURATIONSFORORG_RESPONSE_CODEC_ID, InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29.Serializer, SdkJson)

  private val hostedComputeListNetworkConfigurationsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29> =
      KotlinxSerializationCodec("hosted-compute/list-network-configurations-for-org.response.alternative0", InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29.Serializer, SdkJson)

  internal val hostedComputeListNetworkConfigurationsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29> =
      MediaTypeCodecRegistry.of(hostedComputeListNetworkConfigurationsForOrgResponseCodecAlternative0Codec)

  internal val hostedComputeListNetworkConfigurationsForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val hostedComputeListNetworkConfigurationsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29> =
      MediaTypeCodecRegistry.of(hostedComputeListNetworkConfigurationsForOrgResponseCodec)

  internal const val HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID: String =
      "hosted-compute/update-network-configuration-for-org.request"

  private val hostedComputeUpdateNetworkConfigurationForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf> =
      KotlinxSerializationCodec(HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID, InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf.Serializer, SdkJson)

  internal const val HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID: String =
      "hosted-compute/update-network-configuration-for-org.response"

  private val hostedComputeUpdateNetworkConfigurationForOrgResponseCodec:
      MediaTypeCodec<NetworkConfiguration> =
      KotlinxSerializationCodec(HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID, NetworkConfiguration.Serializer, SdkJson)

  private val hostedComputeUpdateNetworkConfigurationForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<NetworkConfiguration> =
      KotlinxSerializationCodec("hosted-compute/update-network-configuration-for-org.response.alternative0", NetworkConfiguration.Serializer, SdkJson)

  internal val hostedComputeUpdateNetworkConfigurationForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<NetworkConfiguration> =
      MediaTypeCodecRegistry.of(hostedComputeUpdateNetworkConfigurationForOrgResponseCodecAlternative0Codec)

  internal val hostedComputeUpdateNetworkConfigurationForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf> =
      MediaTypeCodecRegistry.of(hostedComputeUpdateNetworkConfigurationForOrgRequestCodec)

  internal val hostedComputeUpdateNetworkConfigurationForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<NetworkConfiguration> =
      MediaTypeCodecRegistry.of(hostedComputeUpdateNetworkConfigurationForOrgResponseCodec)
}

/**
 * Client for the 'hosted-compute' group of GitHub v3 REST API.
 */
public class HostedComputeClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@HostedComputeClient.authentication)

  /**
   * Creates a hosted compute network configuration for an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:network_configurations` scope to use this
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
  public suspend fun hostedComputeCreateNetworkConfigurationForOrg(
    request: InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6,
    org: String,
    options: CallOptions = CallOptions(),
  ): NetworkConfiguration = executor.execute<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6, NetworkConfiguration>(SdkExecutionRequest(hostedComputeCreateNetworkConfigurationForOrgMetadata, baseUri, request, listOf(HostedComputeCodecs.HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(HostedComputeCodecs.HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID), HostedComputeCodecs.hostedComputeCreateNetworkConfigurationForOrgRequestCodecRegistry, HostedComputeCodecs.hostedComputeCreateNetworkConfigurationForOrgResponseCodecRegistry, options)

  /**
   * Creates a hosted compute network configuration for an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:network_configurations` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun hostedComputeCreateNetworkConfigurationForOrgWithResponse(
    request: InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<HostedComputeCreateNetworkConfigurationForOrgResponse> = executor.executeWithResponse<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6, HostedComputeCreateNetworkConfigurationForOrgResponse>(SdkExecutionRequest(hostedComputeCreateNetworkConfigurationForOrgMetadata, baseUri, request, listOf(HostedComputeCodecs.HOSTEDCOMPUTECREATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), HostedComputeCodecs.hostedComputeCreateNetworkConfigurationForOrgRequestCodecRegistry, HostedComputeCreateNetworkConfigurationForOrgResponseDecoder, options)

  /**
   * Deletes a hosted compute network configuration from an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:network_configurations` scope to use this
   * endpoint.
   *
   * @param networkConfigurationId Unique identifier of the hosted compute network configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun hostedComputeDeleteNetworkConfigurationFromOrg(
    networkConfigurationId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(hostedComputeDeleteNetworkConfigurationFromOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_configuration_id", values = listOf(networkConfigurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), HostedComputeCodecs.hostedComputeDeleteNetworkConfigurationFromOrgRequestCodecRegistry, options)

  /**
   * Deletes a hosted compute network configuration from an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:network_configurations` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param networkConfigurationId Unique identifier of the hosted compute network configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun hostedComputeDeleteNetworkConfigurationFromOrgWithResponse(
    networkConfigurationId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<HostedComputeDeleteNetworkConfigurationFromOrgResponse> = executor.executeWithResponse<Unit, HostedComputeDeleteNetworkConfigurationFromOrgResponse>(SdkExecutionRequest(hostedComputeDeleteNetworkConfigurationFromOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_configuration_id", values = listOf(networkConfigurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), HostedComputeCodecs.hostedComputeDeleteNetworkConfigurationFromOrgRequestCodecRegistry, HostedComputeDeleteNetworkConfigurationFromOrgResponseDecoder, options)

  /**
   * Gets a hosted compute network configuration configured in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:network_configurations` scope to use this
   * endpoint.
   *
   * @param networkConfigurationId Unique identifier of the hosted compute network configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun hostedComputeGetNetworkConfigurationForOrg(
    networkConfigurationId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): NetworkConfiguration = executor.execute<Unit, NetworkConfiguration>(SdkExecutionRequest(hostedComputeGetNetworkConfigurationForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_configuration_id", values = listOf(networkConfigurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(HostedComputeCodecs.HOSTEDCOMPUTEGETNETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID), HostedComputeCodecs.hostedComputeGetNetworkConfigurationForOrgRequestCodecRegistry, HostedComputeCodecs.hostedComputeGetNetworkConfigurationForOrgResponseCodecRegistry, options)

  /**
   * Gets a hosted compute network configuration configured in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:network_configurations` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param networkConfigurationId Unique identifier of the hosted compute network configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun hostedComputeGetNetworkConfigurationForOrgWithResponse(
    networkConfigurationId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<HostedComputeGetNetworkConfigurationForOrgResponse> = executor.executeWithResponse<Unit, HostedComputeGetNetworkConfigurationForOrgResponse>(SdkExecutionRequest(hostedComputeGetNetworkConfigurationForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_configuration_id", values = listOf(networkConfigurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), HostedComputeCodecs.hostedComputeGetNetworkConfigurationForOrgRequestCodecRegistry, HostedComputeGetNetworkConfigurationForOrgResponseDecoder, options)

  /**
   * Gets a hosted compute network settings resource configured for an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:network_configurations` scope to use this
   * endpoint.
   *
   * @param networkSettingsId Unique identifier of the hosted compute network settings.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun hostedComputeGetNetworkSettingsForOrg(
    networkSettingsId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): NetworkSettings = executor.execute<Unit, NetworkSettings>(SdkExecutionRequest(hostedComputeGetNetworkSettingsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_settings_id", values = listOf(networkSettingsId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(HostedComputeCodecs.HOSTEDCOMPUTEGETNETWORKSETTINGSFORORG_RESPONSE_CODEC_ID), HostedComputeCodecs.hostedComputeGetNetworkSettingsForOrgRequestCodecRegistry, HostedComputeCodecs.hostedComputeGetNetworkSettingsForOrgResponseCodecRegistry, options)

  /**
   * Gets a hosted compute network settings resource configured for an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:network_configurations` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param networkSettingsId Unique identifier of the hosted compute network settings.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun hostedComputeGetNetworkSettingsForOrgWithResponse(
    networkSettingsId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<HostedComputeGetNetworkSettingsForOrgResponse> = executor.executeWithResponse<Unit, HostedComputeGetNetworkSettingsForOrgResponse>(SdkExecutionRequest(hostedComputeGetNetworkSettingsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_settings_id", values = listOf(networkSettingsId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), HostedComputeCodecs.hostedComputeGetNetworkSettingsForOrgRequestCodecRegistry, HostedComputeGetNetworkSettingsForOrgResponseDecoder, options)

  /**
   * Lists all hosted compute network configurations configured in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:network_configurations` scope to use this
   * endpoint.
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
  public suspend fun hostedComputeListNetworkConfigurationsForOrg(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 = executor.execute<Unit, InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29>(SdkExecutionRequest(hostedComputeListNetworkConfigurationsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(HostedComputeCodecs.HOSTEDCOMPUTELISTNETWORKCONFIGURATIONSFORORG_RESPONSE_CODEC_ID), HostedComputeCodecs.hostedComputeListNetworkConfigurationsForOrgRequestCodecRegistry, HostedComputeCodecs.hostedComputeListNetworkConfigurationsForOrgResponseCodecRegistry, options)

  /**
   * Lists all hosted compute network configurations configured in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:network_configurations` scope to use this
   * endpoint.
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
  public suspend fun hostedComputeListNetworkConfigurationsForOrgWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<HostedComputeListNetworkConfigurationsForOrgResponse> = executor.executeWithResponse<Unit, HostedComputeListNetworkConfigurationsForOrgResponse>(SdkExecutionRequest(hostedComputeListNetworkConfigurationsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), HostedComputeCodecs.hostedComputeListNetworkConfigurationsForOrgRequestCodecRegistry, HostedComputeListNetworkConfigurationsForOrgResponseDecoder, options)

  /**
   * Updates a hosted compute network configuration for an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:network_configurations` scope to use this
   * endpoint.
   *
   * @param request Request body sent to the operation.
   * @param networkConfigurationId Unique identifier of the hosted compute network configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun hostedComputeUpdateNetworkConfigurationForOrg(
    request: InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf,
    networkConfigurationId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): NetworkConfiguration = executor.execute<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf, NetworkConfiguration>(SdkExecutionRequest(hostedComputeUpdateNetworkConfigurationForOrgMetadata, baseUri, request, listOf(HostedComputeCodecs.HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_configuration_id", values = listOf(networkConfigurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(HostedComputeCodecs.HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_RESPONSE_CODEC_ID), HostedComputeCodecs.hostedComputeUpdateNetworkConfigurationForOrgRequestCodecRegistry, HostedComputeCodecs.hostedComputeUpdateNetworkConfigurationForOrgResponseCodecRegistry, options)

  /**
   * Updates a hosted compute network configuration for an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:network_configurations` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param networkConfigurationId Unique identifier of the hosted compute network configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun hostedComputeUpdateNetworkConfigurationForOrgWithResponse(
    request: InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf,
    networkConfigurationId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<HostedComputeUpdateNetworkConfigurationForOrgResponse> = executor.executeWithResponse<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf, HostedComputeUpdateNetworkConfigurationForOrgResponse>(SdkExecutionRequest(hostedComputeUpdateNetworkConfigurationForOrgMetadata, baseUri, request, listOf(HostedComputeCodecs.HOSTEDCOMPUTEUPDATENETWORKCONFIGURATIONFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "network_configuration_id", values = listOf(networkConfigurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), HostedComputeCodecs.hostedComputeUpdateNetworkConfigurationForOrgRequestCodecRegistry, HostedComputeUpdateNetworkConfigurationForOrgResponseDecoder, options)

  /**
   * Typed response alternatives for `hosted-compute/create-network-configuration-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface HostedComputeCreateNetworkConfigurationForOrgResponse {
    public class SuccessJson(
      public val json: NetworkConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeCreateNetworkConfigurationForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeCreateNetworkConfigurationForOrgResponse
  }

  private object HostedComputeCreateNetworkConfigurationForOrgResponseDecoder : SdkResponseAlternativeDecoder<HostedComputeCreateNetworkConfigurationForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): HostedComputeCreateNetworkConfigurationForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<HostedComputeCreateNetworkConfigurationForOrgResponse> = when {
      alternative.id == "hosted-compute/create-network-configuration-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = HostedComputeCreateNetworkConfigurationForOrgResponse.SuccessJson(
          json = HostedComputeCodecs.hostedComputeCreateNetworkConfigurationForOrgResponseCodecAlternative0Registry.select(listOf("hosted-compute/create-network-configuration-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): HostedComputeCreateNetworkConfigurationForOrgResponse = HostedComputeCreateNetworkConfigurationForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `hosted-compute/delete-network-configuration-from-org`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface HostedComputeDeleteNetworkConfigurationFromOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeDeleteNetworkConfigurationFromOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeDeleteNetworkConfigurationFromOrgResponse
  }

  private object HostedComputeDeleteNetworkConfigurationFromOrgResponseDecoder : SdkResponseAlternativeDecoder<HostedComputeDeleteNetworkConfigurationFromOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): HostedComputeDeleteNetworkConfigurationFromOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<HostedComputeDeleteNetworkConfigurationFromOrgResponse> = when {
      alternative.id == "hosted-compute/delete-network-configuration-from-org.response.alternative0" -> SdkResponseDecodeResult(
        value = HostedComputeDeleteNetworkConfigurationFromOrgResponse.SuccessNoContent(
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
    ): HostedComputeDeleteNetworkConfigurationFromOrgResponse = HostedComputeDeleteNetworkConfigurationFromOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `hosted-compute/get-network-configuration-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface HostedComputeGetNetworkConfigurationForOrgResponse {
    public class SuccessJson(
      public val json: NetworkConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeGetNetworkConfigurationForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeGetNetworkConfigurationForOrgResponse
  }

  private object HostedComputeGetNetworkConfigurationForOrgResponseDecoder : SdkResponseAlternativeDecoder<HostedComputeGetNetworkConfigurationForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): HostedComputeGetNetworkConfigurationForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<HostedComputeGetNetworkConfigurationForOrgResponse> = when {
      alternative.id == "hosted-compute/get-network-configuration-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = HostedComputeGetNetworkConfigurationForOrgResponse.SuccessJson(
          json = HostedComputeCodecs.hostedComputeGetNetworkConfigurationForOrgResponseCodecAlternative0Registry.select(listOf("hosted-compute/get-network-configuration-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): HostedComputeGetNetworkConfigurationForOrgResponse = HostedComputeGetNetworkConfigurationForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `hosted-compute/get-network-settings-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface HostedComputeGetNetworkSettingsForOrgResponse {
    public class SuccessJson(
      public val json: NetworkSettings,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeGetNetworkSettingsForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeGetNetworkSettingsForOrgResponse
  }

  private object HostedComputeGetNetworkSettingsForOrgResponseDecoder : SdkResponseAlternativeDecoder<HostedComputeGetNetworkSettingsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): HostedComputeGetNetworkSettingsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<HostedComputeGetNetworkSettingsForOrgResponse> = when {
      alternative.id == "hosted-compute/get-network-settings-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = HostedComputeGetNetworkSettingsForOrgResponse.SuccessJson(
          json = HostedComputeCodecs.hostedComputeGetNetworkSettingsForOrgResponseCodecAlternative0Registry.select(listOf("hosted-compute/get-network-settings-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): HostedComputeGetNetworkSettingsForOrgResponse = HostedComputeGetNetworkSettingsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `hosted-compute/list-network-configurations-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface HostedComputeListNetworkConfigurationsForOrgResponse {
    public class SuccessJson(
      public val json: InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeListNetworkConfigurationsForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeListNetworkConfigurationsForOrgResponse
  }

  private object HostedComputeListNetworkConfigurationsForOrgResponseDecoder : SdkResponseAlternativeDecoder<HostedComputeListNetworkConfigurationsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): HostedComputeListNetworkConfigurationsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<HostedComputeListNetworkConfigurationsForOrgResponse> = when {
      alternative.id == "hosted-compute/list-network-configurations-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = HostedComputeListNetworkConfigurationsForOrgResponse.SuccessJson(
          json = HostedComputeCodecs.hostedComputeListNetworkConfigurationsForOrgResponseCodecAlternative0Registry.select(listOf("hosted-compute/list-network-configurations-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): HostedComputeListNetworkConfigurationsForOrgResponse = HostedComputeListNetworkConfigurationsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `hosted-compute/update-network-configuration-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface HostedComputeUpdateNetworkConfigurationForOrgResponse {
    public class SuccessJson(
      public val json: NetworkConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeUpdateNetworkConfigurationForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : HostedComputeUpdateNetworkConfigurationForOrgResponse
  }

  private object HostedComputeUpdateNetworkConfigurationForOrgResponseDecoder : SdkResponseAlternativeDecoder<HostedComputeUpdateNetworkConfigurationForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): HostedComputeUpdateNetworkConfigurationForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<HostedComputeUpdateNetworkConfigurationForOrgResponse> = when {
      alternative.id == "hosted-compute/update-network-configuration-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = HostedComputeUpdateNetworkConfigurationForOrgResponse.SuccessJson(
          json = HostedComputeCodecs.hostedComputeUpdateNetworkConfigurationForOrgResponseCodecAlternative0Registry.select(listOf("hosted-compute/update-network-configuration-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): HostedComputeUpdateNetworkConfigurationForOrgResponse = HostedComputeUpdateNetworkConfigurationForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val hostedComputeCreateNetworkConfigurationForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "hosted-compute/create-network-configuration-for-org",
          method = "POST",
          path = "/orgs/{org}/settings/network-configurations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "NetworkConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "hosted-compute/create-network-configuration-for-org.response.alternative0",
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

    internal val hostedComputeDeleteNetworkConfigurationFromOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "hosted-compute/delete-network-configuration-from-org",
          method = "DELETE",
          path = "/orgs/{org}/settings/network-configurations/{network_configuration_id}",
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
              id = "hosted-compute/delete-network-configuration-from-org.response.alternative0",
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

    internal val hostedComputeGetNetworkConfigurationForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "hosted-compute/get-network-configuration-for-org",
          method = "GET",
          path = "/orgs/{org}/settings/network-configurations/{network_configuration_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "NetworkConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "hosted-compute/get-network-configuration-for-org.response.alternative0",
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

    internal val hostedComputeGetNetworkSettingsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "hosted-compute/get-network-settings-for-org",
          method = "GET",
          path = "/orgs/{org}/settings/network-settings/{network_settings_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "NetworkSettings",
              mode = SdkResponseMode.BUFFERED,
              id = "hosted-compute/get-network-settings-for-org.response.alternative0",
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

    internal val hostedComputeListNetworkConfigurationsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "hosted-compute/list-network-configurations-for-org",
          method = "GET",
          path = "/orgs/{org}/settings/network-configurations",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29",
              mode = SdkResponseMode.BUFFERED,
              id = "hosted-compute/list-network-configurations-for-org.response.alternative0",
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

    internal val hostedComputeUpdateNetworkConfigurationForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "hosted-compute/update-network-configuration-for-org",
          method = "PATCH",
          path = "/orgs/{org}/settings/network-configurations/{network_configuration_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "NetworkConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "hosted-compute/update-network-configuration-for-org.response.alternative0",
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
