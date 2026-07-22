package com.nabobery.sdkgen.github.generated.enterpriseteamorganizations

import com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4
import com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd
import com.nabobery.sdkgen.github.generated.OrganizationSimple
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

public object EnterpriseTeamOrganizationsCodecs {
  public const val ENTERPRISETEAMORGANIZATIONSADD_RESPONSE_CODEC_ID: String =
      "enterprise-team-organizations/add.response"

  private val enterpriseTeamOrganizationsAddResponseCodec: MediaTypeCodec<OrganizationSimple> =
      KotlinxSerializationCodec(ENTERPRISETEAMORGANIZATIONSADD_RESPONSE_CODEC_ID, OrganizationSimple.Serializer, SdkJson)

  private val enterpriseTeamOrganizationsAddResponseCodecAlternative0Codec:
      MediaTypeCodec<OrganizationSimple> =
      KotlinxSerializationCodec("enterprise-team-organizations/add.response.alternative0", OrganizationSimple.Serializer, SdkJson)

  public val enterpriseTeamOrganizationsAddResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrganizationSimple> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsAddResponseCodecAlternative0Codec)

  public val enterpriseTeamOrganizationsAddRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamOrganizationsAddResponseCodecRegistry:
      MediaTypeCodecRegistry<OrganizationSimple> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsAddResponseCodec)

  public const val ENTERPRISETEAMORGANIZATIONSBULKADD_REQUEST_CODEC_ID: String =
      "enterprise-team-organizations/bulk-add.request"

  private val enterpriseTeamOrganizationsBulkAddRequestCodec:
      MediaTypeCodec<InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4> =
      KotlinxSerializationCodec(ENTERPRISETEAMORGANIZATIONSBULKADD_REQUEST_CODEC_ID, InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4.Serializer, SdkJson)

  public const val ENTERPRISETEAMORGANIZATIONSBULKADD_RESPONSE_CODEC_ID: String =
      "enterprise-team-organizations/bulk-add.response"

  private val enterpriseTeamOrganizationsBulkAddResponseCodec:
      MediaTypeCodec<List<OrganizationSimple>> =
      KotlinxSerializationCodec(ENTERPRISETEAMORGANIZATIONSBULKADD_RESPONSE_CODEC_ID, ListSerializer(OrganizationSimple.Serializer), SdkJson)

  private val enterpriseTeamOrganizationsBulkAddResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OrganizationSimple>> =
      KotlinxSerializationCodec("enterprise-team-organizations/bulk-add.response.alternative0", ListSerializer(OrganizationSimple.Serializer), SdkJson)

  public val enterpriseTeamOrganizationsBulkAddResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OrganizationSimple>> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsBulkAddResponseCodecAlternative0Codec)

  public val enterpriseTeamOrganizationsBulkAddRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsBulkAddRequestCodec)

  public val enterpriseTeamOrganizationsBulkAddResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OrganizationSimple>> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsBulkAddResponseCodec)

  public const val ENTERPRISETEAMORGANIZATIONSBULKREMOVE_REQUEST_CODEC_ID: String =
      "enterprise-team-organizations/bulk-remove.request"

  private val enterpriseTeamOrganizationsBulkRemoveRequestCodec:
      MediaTypeCodec<InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd> =
      KotlinxSerializationCodec(ENTERPRISETEAMORGANIZATIONSBULKREMOVE_REQUEST_CODEC_ID, InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd.Serializer, SdkJson)

  public val enterpriseTeamOrganizationsBulkRemoveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsBulkRemoveRequestCodec)

  public val enterpriseTeamOrganizationsBulkRemoveResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val enterpriseTeamOrganizationsDeleteRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamOrganizationsDeleteResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val ENTERPRISETEAMORGANIZATIONSGETASSIGNMENT_RESPONSE_CODEC_ID: String =
      "enterprise-team-organizations/get-assignment.response"

  private val enterpriseTeamOrganizationsGetAssignmentResponseCodec:
      MediaTypeCodec<OrganizationSimple> =
      KotlinxSerializationCodec(ENTERPRISETEAMORGANIZATIONSGETASSIGNMENT_RESPONSE_CODEC_ID, OrganizationSimple.Serializer, SdkJson)

  private val enterpriseTeamOrganizationsGetAssignmentResponseCodecAlternative0Codec:
      MediaTypeCodec<OrganizationSimple> =
      KotlinxSerializationCodec("enterprise-team-organizations/get-assignment.response.alternative0", OrganizationSimple.Serializer, SdkJson)

  public val enterpriseTeamOrganizationsGetAssignmentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrganizationSimple> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsGetAssignmentResponseCodecAlternative0Codec)

  public val enterpriseTeamOrganizationsGetAssignmentRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val enterpriseTeamOrganizationsGetAssignmentResponseCodecRegistry:
      MediaTypeCodecRegistry<OrganizationSimple> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsGetAssignmentResponseCodec)

  public const val ENTERPRISETEAMORGANIZATIONSGETASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "enterprise-team-organizations/get-assignments.response"

  private val enterpriseTeamOrganizationsGetAssignmentsResponseCodec:
      MediaTypeCodec<List<OrganizationSimple>> =
      KotlinxSerializationCodec(ENTERPRISETEAMORGANIZATIONSGETASSIGNMENTS_RESPONSE_CODEC_ID, ListSerializer(OrganizationSimple.Serializer), SdkJson)

  private val enterpriseTeamOrganizationsGetAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OrganizationSimple>> =
      KotlinxSerializationCodec("enterprise-team-organizations/get-assignments.response.alternative0", ListSerializer(OrganizationSimple.Serializer), SdkJson)

  public val enterpriseTeamOrganizationsGetAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OrganizationSimple>> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsGetAssignmentsResponseCodecAlternative0Codec)

  public val enterpriseTeamOrganizationsGetAssignmentsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val enterpriseTeamOrganizationsGetAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OrganizationSimple>> =
      MediaTypeCodecRegistry.of(enterpriseTeamOrganizationsGetAssignmentsResponseCodec)
}

/**
 * Client for the 'enterprise-team-organizations' group of GitHub v3 REST API.
 */
public class EnterpriseTeamOrganizationsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@EnterpriseTeamOrganizationsClient.authentication)

  /**
   * Assign an enterprise team to an organization.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamOrganizationsAdd(
    enterprise: String,
    enterpriseTeam: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): OrganizationSimple = executor.execute<Unit, OrganizationSimple>(SdkExecutionRequest(enterpriseTeamOrganizationsAddMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSADD_RESPONSE_CODEC_ID), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsAddRequestCodecRegistry, EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsAddResponseCodecRegistry, options)

  /**
   * Assign an enterprise team to an organization.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamOrganizationsAddWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamOrganizationsAddResponse> = executor.executeWithResponse<Unit, EnterpriseTeamOrganizationsAddResponse>(SdkExecutionRequest(enterpriseTeamOrganizationsAddMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsAddRequestCodecRegistry, EnterpriseTeamOrganizationsAddResponseDecoder, options)

  /**
   * Assign an enterprise team to multiple organizations.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamOrganizationsBulkAdd(
    request: InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): List<OrganizationSimple> = executor.execute<InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4, List<OrganizationSimple>>(SdkExecutionRequest(enterpriseTeamOrganizationsBulkAddMetadata, baseUri, request, listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSBULKADD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSBULKADD_RESPONSE_CODEC_ID), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsBulkAddRequestCodecRegistry, EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsBulkAddResponseCodecRegistry, options)

  /**
   * Assign an enterprise team to multiple organizations.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamOrganizationsBulkAddWithResponse(
    request: InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamOrganizationsBulkAddResponse> = executor.executeWithResponse<InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4, EnterpriseTeamOrganizationsBulkAddResponse>(SdkExecutionRequest(enterpriseTeamOrganizationsBulkAddMetadata, baseUri, request, listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSBULKADD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsBulkAddRequestCodecRegistry, EnterpriseTeamOrganizationsBulkAddResponseDecoder, options)

  /**
   * Unassign an enterprise team from multiple organizations.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamOrganizationsBulkRemove(
    request: InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd>(SdkExecutionRequest(enterpriseTeamOrganizationsBulkRemoveMetadata, baseUri, request, listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSBULKREMOVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsBulkRemoveRequestCodecRegistry, options)

  /**
   * Unassign an enterprise team from multiple organizations.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamOrganizationsBulkRemoveWithResponse(
    request: InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamOrganizationsBulkRemoveResponse> = executor.executeWithResponse<InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd, EnterpriseTeamOrganizationsBulkRemoveResponse>(SdkExecutionRequest(enterpriseTeamOrganizationsBulkRemoveMetadata, baseUri, request, listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSBULKREMOVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsBulkRemoveRequestCodecRegistry, EnterpriseTeamOrganizationsBulkRemoveResponseDecoder, options)

  /**
   * Unassign an enterprise team from an organization.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamOrganizationsDelete(
    enterprise: String,
    enterpriseTeam: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(enterpriseTeamOrganizationsDeleteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsDeleteRequestCodecRegistry, options)

  /**
   * Unassign an enterprise team from an organization.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamOrganizationsDeleteWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamOrganizationsDeleteResponse> = executor.executeWithResponse<Unit, EnterpriseTeamOrganizationsDeleteResponse>(SdkExecutionRequest(enterpriseTeamOrganizationsDeleteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsDeleteRequestCodecRegistry, EnterpriseTeamOrganizationsDeleteResponseDecoder, options)

  /**
   * Check if an enterprise team is assigned to an organization
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws EnterpriseTeamOrganizationsGetAssignmentApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded EnterpriseTeamOrganizationsGetAssignmentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamOrganizationsGetAssignment(
    enterprise: String,
    enterpriseTeam: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): OrganizationSimple = executor.executeWithTypedErrors<Unit, EnterpriseTeamOrganizationsGetAssignmentResponse, OrganizationSimple>(
    request = SdkExecutionRequest(enterpriseTeamOrganizationsGetAssignmentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentRequestCodecRegistry,
    responseDecoder = EnterpriseTeamOrganizationsGetAssignmentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EnterpriseTeamOrganizationsGetAssignmentResponse.SuccessJson -> response.json
        is EnterpriseTeamOrganizationsGetAssignmentResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is EnterpriseTeamOrganizationsGetAssignmentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EnterpriseTeamOrganizationsGetAssignmentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is EnterpriseTeamOrganizationsGetAssignmentResponse.Http404NoContent -> EnterpriseTeamOrganizationsGetAssignmentApiException(response, statusCode, headers)
        is EnterpriseTeamOrganizationsGetAssignmentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Check if an enterprise team is assigned to an organization
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamOrganizationsGetAssignmentWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamOrganizationsGetAssignmentResponse> = executor.executeWithResponse<Unit, EnterpriseTeamOrganizationsGetAssignmentResponse>(SdkExecutionRequest(enterpriseTeamOrganizationsGetAssignmentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentRequestCodecRegistry, EnterpriseTeamOrganizationsGetAssignmentResponseDecoder, options)

  /**
   * Get all organizations assigned to an enterprise team
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamOrganizationsGetAssignments(
    enterprise: String,
    enterpriseTeam: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<OrganizationSimple> = executor.execute<Unit, List<OrganizationSimple>>(SdkExecutionRequest(enterpriseTeamOrganizationsGetAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(EnterpriseTeamOrganizationsCodecs.ENTERPRISETEAMORGANIZATIONSGETASSIGNMENTS_RESPONSE_CODEC_ID), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentsRequestCodecRegistry, EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentsResponseCodecRegistry, options)

  /**
   * Get all organizations assigned to an enterprise team
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamOrganizationsGetAssignmentsWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamOrganizationsGetAssignmentsResponse> = executor.executeWithResponse<Unit, EnterpriseTeamOrganizationsGetAssignmentsResponse>(SdkExecutionRequest(enterpriseTeamOrganizationsGetAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentsRequestCodecRegistry, EnterpriseTeamOrganizationsGetAssignmentsResponseDecoder, options)

  /**
   * Typed response alternatives for `enterprise-team-organizations/add`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface EnterpriseTeamOrganizationsAddResponse {
    public class SuccessJson(
      public val json: OrganizationSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsAddResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsAddResponse
  }

  private object EnterpriseTeamOrganizationsAddResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamOrganizationsAddResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamOrganizationsAddResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamOrganizationsAddResponse> = when {
      alternative.id == "enterprise-team-organizations/add.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsAddResponse.SuccessJson(
          json = EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsAddResponseCodecAlternative0Registry.select(listOf("enterprise-team-organizations/add.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamOrganizationsAddResponse = EnterpriseTeamOrganizationsAddResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-organizations/bulk-add`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface EnterpriseTeamOrganizationsBulkAddResponse {
    public class SuccessJson(
      public val json: List<OrganizationSimple>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsBulkAddResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsBulkAddResponse
  }

  private object EnterpriseTeamOrganizationsBulkAddResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamOrganizationsBulkAddResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamOrganizationsBulkAddResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamOrganizationsBulkAddResponse> = when {
      alternative.id == "enterprise-team-organizations/bulk-add.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsBulkAddResponse.SuccessJson(
          json = EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsBulkAddResponseCodecAlternative0Registry.select(listOf("enterprise-team-organizations/bulk-add.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamOrganizationsBulkAddResponse = EnterpriseTeamOrganizationsBulkAddResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-organizations/bulk-remove`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface EnterpriseTeamOrganizationsBulkRemoveResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsBulkRemoveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsBulkRemoveResponse
  }

  private object EnterpriseTeamOrganizationsBulkRemoveResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamOrganizationsBulkRemoveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamOrganizationsBulkRemoveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamOrganizationsBulkRemoveResponse> = when {
      alternative.id == "enterprise-team-organizations/bulk-remove.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsBulkRemoveResponse.SuccessNoContent(
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
    ): EnterpriseTeamOrganizationsBulkRemoveResponse = EnterpriseTeamOrganizationsBulkRemoveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-organizations/delete`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface EnterpriseTeamOrganizationsDeleteResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsDeleteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsDeleteResponse
  }

  private object EnterpriseTeamOrganizationsDeleteResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamOrganizationsDeleteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamOrganizationsDeleteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamOrganizationsDeleteResponse> = when {
      alternative.id == "enterprise-team-organizations/delete.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsDeleteResponse.SuccessNoContent(
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
    ): EnterpriseTeamOrganizationsDeleteResponse = EnterpriseTeamOrganizationsDeleteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `enterprise-team-organizations/get-assignment` may expose through
   * its typed API exception.
   */
  public sealed interface EnterpriseTeamOrganizationsGetAssignmentError

  /**
   * Typed response alternatives for `enterprise-team-organizations/get-assignment`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface EnterpriseTeamOrganizationsGetAssignmentResponse {
    public class SuccessJson(
      public val json: OrganizationSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsGetAssignmentResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsGetAssignmentResponse,
        EnterpriseTeamOrganizationsGetAssignmentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsGetAssignmentResponse
  }

  /**
   * Raised by `enterprise-team-organizations/get-assignment` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class EnterpriseTeamOrganizationsGetAssignmentApiException(
    public val error: EnterpriseTeamOrganizationsGetAssignmentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "enterprise-team-organizations/get-assignment")

  private object EnterpriseTeamOrganizationsGetAssignmentResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamOrganizationsGetAssignmentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamOrganizationsGetAssignmentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamOrganizationsGetAssignmentResponse> = when {
      alternative.id == "enterprise-team-organizations/get-assignment.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsGetAssignmentResponse.SuccessJson(
          json = EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentResponseCodecAlternative0Registry.select(listOf("enterprise-team-organizations/get-assignment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "enterprise-team-organizations/get-assignment.response.alternative1" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsGetAssignmentResponse.Http404NoContent(
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
    ): EnterpriseTeamOrganizationsGetAssignmentResponse = EnterpriseTeamOrganizationsGetAssignmentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-organizations/get-assignments`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface EnterpriseTeamOrganizationsGetAssignmentsResponse {
    public class SuccessJson(
      public val json: List<OrganizationSimple>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsGetAssignmentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamOrganizationsGetAssignmentsResponse
  }

  private object EnterpriseTeamOrganizationsGetAssignmentsResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamOrganizationsGetAssignmentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamOrganizationsGetAssignmentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamOrganizationsGetAssignmentsResponse> = when {
      alternative.id == "enterprise-team-organizations/get-assignments.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamOrganizationsGetAssignmentsResponse.SuccessJson(
          json = EnterpriseTeamOrganizationsCodecs.enterpriseTeamOrganizationsGetAssignmentsResponseCodecAlternative0Registry.select(listOf("enterprise-team-organizations/get-assignments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamOrganizationsGetAssignmentsResponse = EnterpriseTeamOrganizationsGetAssignmentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val enterpriseTeamOrganizationsAddMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-organizations/add",
          method = "PUT",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/organizations/{org}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "OrganizationSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-team-organizations/add.response.alternative0",
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

    public val enterpriseTeamOrganizationsBulkAddMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-organizations/bulk-add",
          method = "POST",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/organizations/add",
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
              id = "enterprise-team-organizations/bulk-add.response.alternative0",
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

    public val enterpriseTeamOrganizationsBulkRemoveMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-organizations/bulk-remove",
          method = "POST",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/organizations/remove",
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
              id = "enterprise-team-organizations/bulk-remove.response.alternative0",
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

    public val enterpriseTeamOrganizationsDeleteMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-organizations/delete",
          method = "DELETE",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/organizations/{org}",
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
              id = "enterprise-team-organizations/delete.response.alternative0",
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

    public val enterpriseTeamOrganizationsGetAssignmentMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "enterprise-team-organizations/get-assignment",
          method = "GET",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/organizations/{org}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OrganizationSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-team-organizations/get-assignment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-team-organizations/get-assignment.response.alternative1",
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

    public val enterpriseTeamOrganizationsGetAssignmentsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "enterprise-team-organizations/get-assignments",
          method = "GET",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/organizations",
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
              id = "enterprise-team-organizations/get-assignments.response.alternative0",
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
  }
}
