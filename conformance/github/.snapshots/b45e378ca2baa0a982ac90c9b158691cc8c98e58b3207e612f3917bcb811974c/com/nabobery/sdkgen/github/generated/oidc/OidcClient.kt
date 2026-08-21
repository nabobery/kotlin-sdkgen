package com.nabobery.sdkgen.github.generated.oidc

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b
import com.nabobery.sdkgen.github.generated.OidcCustomPropertyInclusion
import com.nabobery.sdkgen.github.generated.OidcCustomPropertyInclusionInput
import com.nabobery.sdkgen.github.generated.OidcCustomSub
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
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.JsonObject

internal object OidcCodecs {
  internal const val OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORENTERPRISE_REQUEST_CODEC_ID: String =
      "oidc/create-oidc-custom-property-inclusion-for-enterprise.request"

  private val oidcCreateOidcCustomPropertyInclusionForEnterpriseRequestCodec:
      MediaTypeCodec<OidcCustomPropertyInclusionInput> =
      KotlinxSerializationCodec(OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORENTERPRISE_REQUEST_CODEC_ID, OidcCustomPropertyInclusionInput.Serializer, SdkJson)

  internal const val OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "oidc/create-oidc-custom-property-inclusion-for-enterprise.response"

  private val oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodec:
      MediaTypeCodec<OidcCustomPropertyInclusion> =
      KotlinxSerializationCodec(OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORENTERPRISE_RESPONSE_CODEC_ID, OidcCustomPropertyInclusion.Serializer, SdkJson)

  private val oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<OidcCustomPropertyInclusion> =
      KotlinxSerializationCodec("oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative0", OidcCustomPropertyInclusion.Serializer, SdkJson)

  internal val oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OidcCustomPropertyInclusion> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative0Codec)

  private val oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Codec)

  internal val oidcCreateOidcCustomPropertyInclusionForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<OidcCustomPropertyInclusionInput> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForEnterpriseRequestCodec)

  internal val oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<OidcCustomPropertyInclusion> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodec)

  internal const val OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORORG_REQUEST_CODEC_ID: String =
      "oidc/create-oidc-custom-property-inclusion-for-org.request"

  private val oidcCreateOidcCustomPropertyInclusionForOrgRequestCodec:
      MediaTypeCodec<OidcCustomPropertyInclusionInput> =
      KotlinxSerializationCodec(OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORORG_REQUEST_CODEC_ID, OidcCustomPropertyInclusionInput.Serializer, SdkJson)

  internal const val OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORORG_RESPONSE_CODEC_ID: String =
      "oidc/create-oidc-custom-property-inclusion-for-org.response"

  private val oidcCreateOidcCustomPropertyInclusionForOrgResponseCodec:
      MediaTypeCodec<OidcCustomPropertyInclusion> =
      KotlinxSerializationCodec(OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORORG_RESPONSE_CODEC_ID, OidcCustomPropertyInclusion.Serializer, SdkJson)

  private val oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<OidcCustomPropertyInclusion> =
      KotlinxSerializationCodec("oidc/create-oidc-custom-property-inclusion-for-org.response.alternative0", OidcCustomPropertyInclusion.Serializer, SdkJson)

  internal val oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OidcCustomPropertyInclusion> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative0Codec)

  private val oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/create-oidc-custom-property-inclusion-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Codec)

  internal val oidcCreateOidcCustomPropertyInclusionForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<OidcCustomPropertyInclusionInput> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForOrgRequestCodec)

  internal val oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<OidcCustomPropertyInclusion> =
      MediaTypeCodecRegistry.of(oidcCreateOidcCustomPropertyInclusionForOrgResponseCodec)

  private val oidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Codec)

  internal val oidcDeleteOidcCustomPropertyInclusionForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val oidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val oidcDeleteOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcDeleteOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcDeleteOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Codec)

  internal val oidcDeleteOidcCustomPropertyInclusionForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val oidcDeleteOidcCustomPropertyInclusionForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val OIDCGETOIDCCUSTOMSUBTEMPLATEFORORG_RESPONSE_CODEC_ID: String =
      "oidc/get-oidc-custom-sub-template-for-org.response"

  private val oidcGetOidcCustomSubTemplateForOrgResponseCodec: MediaTypeCodec<OidcCustomSub> =
      KotlinxSerializationCodec(OIDCGETOIDCCUSTOMSUBTEMPLATEFORORG_RESPONSE_CODEC_ID, OidcCustomSub.Serializer, SdkJson)

  private val oidcGetOidcCustomSubTemplateForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<OidcCustomSub> =
      KotlinxSerializationCodec("oidc/get-oidc-custom-sub-template-for-org.response.alternative0", OidcCustomSub.Serializer, SdkJson)

  internal val oidcGetOidcCustomSubTemplateForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OidcCustomSub> =
      MediaTypeCodecRegistry.of(oidcGetOidcCustomSubTemplateForOrgResponseCodecAlternative0Codec)

  internal val oidcGetOidcCustomSubTemplateForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val oidcGetOidcCustomSubTemplateForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<OidcCustomSub> =
      MediaTypeCodecRegistry.of(oidcGetOidcCustomSubTemplateForOrgResponseCodec)

  internal const val OIDCLISTOIDCCUSTOMPROPERTYINCLUSIONSFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "oidc/list-oidc-custom-property-inclusions-for-enterprise.response"

  private val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodec:
      MediaTypeCodec<List<OidcCustomPropertyInclusion>> =
      KotlinxSerializationCodec(OIDCLISTOIDCCUSTOMPROPERTYINCLUSIONSFORENTERPRISE_RESPONSE_CODEC_ID, ListSerializer(OidcCustomPropertyInclusion.Serializer), SdkJson)

  private val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OidcCustomPropertyInclusion>> =
      KotlinxSerializationCodec("oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative0", ListSerializer(OidcCustomPropertyInclusion.Serializer), SdkJson)

  internal val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OidcCustomPropertyInclusion>> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative0Codec)

  private val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative1Codec)

  private val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative2Codec)

  internal val oidcListOidcCustomPropertyInclusionsForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OidcCustomPropertyInclusion>> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodec)

  internal const val OIDCLISTOIDCCUSTOMPROPERTYINCLUSIONSFORORG_RESPONSE_CODEC_ID: String =
      "oidc/list-oidc-custom-property-inclusions-for-org.response"

  private val oidcListOidcCustomPropertyInclusionsForOrgResponseCodec:
      MediaTypeCodec<List<OidcCustomPropertyInclusion>> =
      KotlinxSerializationCodec(OIDCLISTOIDCCUSTOMPROPERTYINCLUSIONSFORORG_RESPONSE_CODEC_ID, ListSerializer(OidcCustomPropertyInclusion.Serializer), SdkJson)

  private val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OidcCustomPropertyInclusion>> =
      KotlinxSerializationCodec("oidc/list-oidc-custom-property-inclusions-for-org.response.alternative0", ListSerializer(OidcCustomPropertyInclusion.Serializer), SdkJson)

  internal val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OidcCustomPropertyInclusion>> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative0Codec)

  private val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/list-oidc-custom-property-inclusions-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative1Codec)

  private val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/list-oidc-custom-property-inclusions-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative2Codec)

  internal val oidcListOidcCustomPropertyInclusionsForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val oidcListOidcCustomPropertyInclusionsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OidcCustomPropertyInclusion>> =
      MediaTypeCodecRegistry.of(oidcListOidcCustomPropertyInclusionsForOrgResponseCodec)

  internal const val OIDCUPDATEOIDCCUSTOMSUBTEMPLATEFORORG_REQUEST_CODEC_ID: String =
      "oidc/update-oidc-custom-sub-template-for-org.request"

  private val oidcUpdateOidcCustomSubTemplateForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b> =
      KotlinxSerializationCodec(OIDCUPDATEOIDCCUSTOMSUBTEMPLATEFORORG_REQUEST_CODEC_ID, InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b.Serializer, SdkJson)

  internal const val OIDCUPDATEOIDCCUSTOMSUBTEMPLATEFORORG_RESPONSE_CODEC_ID: String =
      "oidc/update-oidc-custom-sub-template-for-org.response"

  private val oidcUpdateOidcCustomSubTemplateForOrgResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(OIDCUPDATEOIDCCUSTOMSUBTEMPLATEFORORG_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("oidc/update-oidc-custom-sub-template-for-org.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative0Codec)

  private val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/update-oidc-custom-sub-template-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative1Codec)

  private val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("oidc/update-oidc-custom-sub-template-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative2Codec)

  internal val oidcUpdateOidcCustomSubTemplateForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b> =
      MediaTypeCodecRegistry.of(oidcUpdateOidcCustomSubTemplateForOrgRequestCodec)

  internal val oidcUpdateOidcCustomSubTemplateForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(oidcUpdateOidcCustomSubTemplateForOrgResponseCodec)
}

/**
 * Client for the 'oidc' group of GitHub v3 REST API.
 */
public class OidcClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@OidcClient.authentication)

  /**
   * Adds a repository custom property to be included in the OIDC token for repository actions in an enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws OidcCreateOidcCustomPropertyInclusionForEnterpriseApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * OidcCreateOidcCustomPropertyInclusionForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcCreateOidcCustomPropertyInclusionForEnterprise(
    request: OidcCustomPropertyInclusionInput,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): OidcCustomPropertyInclusion = executor.executeWithTypedErrors<OidcCustomPropertyInclusionInput, OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse, OidcCustomPropertyInclusion>(
    request = SdkExecutionRequest(oidcCreateOidcCustomPropertyInclusionForEnterpriseMetadata, baseUri, request, listOf(OidcCodecs.OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORENTERPRISE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = OidcCodecs.oidcCreateOidcCustomPropertyInclusionForEnterpriseRequestCodecRegistry,
    responseDecoder = OidcCreateOidcCustomPropertyInclusionForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.SuccessJson -> response.json
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http400NoContent -> OidcCreateOidcCustomPropertyInclusionForEnterpriseApiException(response, statusCode, headers)
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http403Json -> OidcCreateOidcCustomPropertyInclusionForEnterpriseApiException(response, statusCode, headers)
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http422NoContent -> OidcCreateOidcCustomPropertyInclusionForEnterpriseApiException(response, statusCode, headers)
        is OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository custom property to be included in the OIDC token for repository actions in an enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun oidcCreateOidcCustomPropertyInclusionForEnterpriseWithResponse(
    request: OidcCustomPropertyInclusionInput,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse> = executor.executeWithResponse<OidcCustomPropertyInclusionInput, OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse>(SdkExecutionRequest(oidcCreateOidcCustomPropertyInclusionForEnterpriseMetadata, baseUri, request, listOf(OidcCodecs.OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORENTERPRISE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), OidcCodecs.oidcCreateOidcCustomPropertyInclusionForEnterpriseRequestCodecRegistry, OidcCreateOidcCustomPropertyInclusionForEnterpriseResponseDecoder, options)

  /**
   * Adds a repository custom property to be included in the OIDC token for repository actions in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws OidcCreateOidcCustomPropertyInclusionForOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded OidcCreateOidcCustomPropertyInclusionForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcCreateOidcCustomPropertyInclusionForOrg(
    request: OidcCustomPropertyInclusionInput,
    org: String,
    options: CallOptions = CallOptions(),
  ): OidcCustomPropertyInclusion = executor.executeWithTypedErrors<OidcCustomPropertyInclusionInput, OidcCreateOidcCustomPropertyInclusionForOrgResponse, OidcCustomPropertyInclusion>(
    request = SdkExecutionRequest(oidcCreateOidcCustomPropertyInclusionForOrgMetadata, baseUri, request, listOf(OidcCodecs.OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = OidcCodecs.oidcCreateOidcCustomPropertyInclusionForOrgRequestCodecRegistry,
    responseDecoder = OidcCreateOidcCustomPropertyInclusionForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.SuccessJson -> response.json
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http400NoContent -> OidcCreateOidcCustomPropertyInclusionForOrgApiException(response, statusCode, headers)
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http403Json -> OidcCreateOidcCustomPropertyInclusionForOrgApiException(response, statusCode, headers)
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http422NoContent -> OidcCreateOidcCustomPropertyInclusionForOrgApiException(response, statusCode, headers)
        is OidcCreateOidcCustomPropertyInclusionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository custom property to be included in the OIDC token for repository actions in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun oidcCreateOidcCustomPropertyInclusionForOrgWithResponse(
    request: OidcCustomPropertyInclusionInput,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<OidcCreateOidcCustomPropertyInclusionForOrgResponse> = executor.executeWithResponse<OidcCustomPropertyInclusionInput, OidcCreateOidcCustomPropertyInclusionForOrgResponse>(SdkExecutionRequest(oidcCreateOidcCustomPropertyInclusionForOrgMetadata, baseUri, request, listOf(OidcCodecs.OIDCCREATEOIDCCUSTOMPROPERTYINCLUSIONFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), OidcCodecs.oidcCreateOidcCustomPropertyInclusionForOrgRequestCodecRegistry, OidcCreateOidcCustomPropertyInclusionForOrgResponseDecoder, options)

  /**
   * Removes a repository custom property from being included in the OIDC token for repository actions in an enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param customPropertyName The name of the custom property to remove from OIDC token inclusion
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return No response body.
   * @throws OidcDeleteOidcCustomPropertyInclusionForEnterpriseApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * OidcDeleteOidcCustomPropertyInclusionForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcDeleteOidcCustomPropertyInclusionForEnterprise(
    customPropertyName: String,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse, Unit>(
    request = SdkExecutionRequest(oidcDeleteOidcCustomPropertyInclusionForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "custom_property_name", values = listOf(customPropertyName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = OidcCodecs.oidcDeleteOidcCustomPropertyInclusionForEnterpriseRequestCodecRegistry,
    responseDecoder = OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.SuccessNoContent -> response.unit
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http400NoContent -> response.unit
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http404NoContent -> response.unit
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http400NoContent -> OidcDeleteOidcCustomPropertyInclusionForEnterpriseApiException(response, statusCode, headers)
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http403Json -> OidcDeleteOidcCustomPropertyInclusionForEnterpriseApiException(response, statusCode, headers)
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http404NoContent -> OidcDeleteOidcCustomPropertyInclusionForEnterpriseApiException(response, statusCode, headers)
        is OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository custom property from being included in the OIDC token for repository actions in an enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param customPropertyName The name of the custom property to remove from OIDC token inclusion
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun oidcDeleteOidcCustomPropertyInclusionForEnterpriseWithResponse(
    customPropertyName: String,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse> = executor.executeWithResponse<Unit, OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse>(SdkExecutionRequest(oidcDeleteOidcCustomPropertyInclusionForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "custom_property_name", values = listOf(customPropertyName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), OidcCodecs.oidcDeleteOidcCustomPropertyInclusionForEnterpriseRequestCodecRegistry, OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseDecoder, options)

  /**
   * Removes a repository custom property from being included in the OIDC token for repository actions in an
   * organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param customPropertyName The name of the custom property to remove from OIDC token inclusion
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws OidcDeleteOidcCustomPropertyInclusionForOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded OidcDeleteOidcCustomPropertyInclusionForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcDeleteOidcCustomPropertyInclusionForOrg(
    customPropertyName: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, OidcDeleteOidcCustomPropertyInclusionForOrgResponse, Unit>(
    request = SdkExecutionRequest(oidcDeleteOidcCustomPropertyInclusionForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "custom_property_name", values = listOf(customPropertyName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = OidcCodecs.oidcDeleteOidcCustomPropertyInclusionForOrgRequestCodecRegistry,
    responseDecoder = OidcDeleteOidcCustomPropertyInclusionForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.SuccessNoContent -> response.unit
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http400NoContent -> response.unit
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http404NoContent -> response.unit
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http400NoContent -> OidcDeleteOidcCustomPropertyInclusionForOrgApiException(response, statusCode, headers)
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http403Json -> OidcDeleteOidcCustomPropertyInclusionForOrgApiException(response, statusCode, headers)
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http404NoContent -> OidcDeleteOidcCustomPropertyInclusionForOrgApiException(response, statusCode, headers)
        is OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository custom property from being included in the OIDC token for repository actions in an
   * organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param customPropertyName The name of the custom property to remove from OIDC token inclusion
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun oidcDeleteOidcCustomPropertyInclusionForOrgWithResponse(
    customPropertyName: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<OidcDeleteOidcCustomPropertyInclusionForOrgResponse> = executor.executeWithResponse<Unit, OidcDeleteOidcCustomPropertyInclusionForOrgResponse>(SdkExecutionRequest(oidcDeleteOidcCustomPropertyInclusionForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "custom_property_name", values = listOf(customPropertyName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), OidcCodecs.oidcDeleteOidcCustomPropertyInclusionForOrgRequestCodecRegistry, OidcDeleteOidcCustomPropertyInclusionForOrgResponseDecoder, options)

  /**
   * Gets the customization template for an OpenID Connect (OIDC) subject claim.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcGetOidcCustomSubTemplateForOrg(org: String, options: CallOptions = CallOptions()): OidcCustomSub = executor.execute<Unit, OidcCustomSub>(SdkExecutionRequest(oidcGetOidcCustomSubTemplateForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(OidcCodecs.OIDCGETOIDCCUSTOMSUBTEMPLATEFORORG_RESPONSE_CODEC_ID), OidcCodecs.oidcGetOidcCustomSubTemplateForOrgRequestCodecRegistry, OidcCodecs.oidcGetOidcCustomSubTemplateForOrgResponseCodecRegistry, options)

  /**
   * Gets the customization template for an OpenID Connect (OIDC) subject claim.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun oidcGetOidcCustomSubTemplateForOrgWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<OidcGetOidcCustomSubTemplateForOrgResponse> = executor.executeWithResponse<Unit, OidcGetOidcCustomSubTemplateForOrgResponse>(SdkExecutionRequest(oidcGetOidcCustomSubTemplateForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), OidcCodecs.oidcGetOidcCustomSubTemplateForOrgRequestCodecRegistry, OidcGetOidcCustomSubTemplateForOrgResponseDecoder, options)

  /**
   * Lists the repository custom properties that are included in the OIDC token for repository actions in an enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws OidcListOidcCustomPropertyInclusionsForEnterpriseApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * OidcListOidcCustomPropertyInclusionsForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcListOidcCustomPropertyInclusionsForEnterprise(enterprise: String, options: CallOptions = CallOptions()): List<OidcCustomPropertyInclusion> = executor.executeWithTypedErrors<Unit, OidcListOidcCustomPropertyInclusionsForEnterpriseResponse, List<OidcCustomPropertyInclusion>>(
    request = SdkExecutionRequest(oidcListOidcCustomPropertyInclusionsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = OidcCodecs.oidcListOidcCustomPropertyInclusionsForEnterpriseRequestCodecRegistry,
    responseDecoder = OidcListOidcCustomPropertyInclusionsForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.SuccessJson -> response.json
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Http403Json -> OidcListOidcCustomPropertyInclusionsForEnterpriseApiException(response, statusCode, headers)
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Http404Json -> OidcListOidcCustomPropertyInclusionsForEnterpriseApiException(response, statusCode, headers)
        is OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the repository custom properties that are included in the OIDC token for repository actions in an enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun oidcListOidcCustomPropertyInclusionsForEnterpriseWithResponse(enterprise: String, options: CallOptions = CallOptions()): SdkResponseResult<OidcListOidcCustomPropertyInclusionsForEnterpriseResponse> = executor.executeWithResponse<Unit, OidcListOidcCustomPropertyInclusionsForEnterpriseResponse>(SdkExecutionRequest(oidcListOidcCustomPropertyInclusionsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), OidcCodecs.oidcListOidcCustomPropertyInclusionsForEnterpriseRequestCodecRegistry, OidcListOidcCustomPropertyInclusionsForEnterpriseResponseDecoder, options)

  /**
   * Lists the repository custom properties that are included in the OIDC token for repository actions in an
   * organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws OidcListOidcCustomPropertyInclusionsForOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded OidcListOidcCustomPropertyInclusionsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcListOidcCustomPropertyInclusionsForOrg(org: String, options: CallOptions = CallOptions()): List<OidcCustomPropertyInclusion> = executor.executeWithTypedErrors<Unit, OidcListOidcCustomPropertyInclusionsForOrgResponse, List<OidcCustomPropertyInclusion>>(
    request = SdkExecutionRequest(oidcListOidcCustomPropertyInclusionsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = OidcCodecs.oidcListOidcCustomPropertyInclusionsForOrgRequestCodecRegistry,
    responseDecoder = OidcListOidcCustomPropertyInclusionsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.SuccessJson -> response.json
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.Http403Json -> OidcListOidcCustomPropertyInclusionsForOrgApiException(response, statusCode, headers)
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.Http404Json -> OidcListOidcCustomPropertyInclusionsForOrgApiException(response, statusCode, headers)
        is OidcListOidcCustomPropertyInclusionsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the repository custom properties that are included in the OIDC token for repository actions in an
   * organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun oidcListOidcCustomPropertyInclusionsForOrgWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<OidcListOidcCustomPropertyInclusionsForOrgResponse> = executor.executeWithResponse<Unit, OidcListOidcCustomPropertyInclusionsForOrgResponse>(SdkExecutionRequest(oidcListOidcCustomPropertyInclusionsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), OidcCodecs.oidcListOidcCustomPropertyInclusionsForOrgRequestCodecRegistry, OidcListOidcCustomPropertyInclusionsForOrgResponseDecoder, options)

  /**
   * Creates or updates the customization template for an OpenID Connect (OIDC) subject claim.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws OidcUpdateOidcCustomSubTemplateForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded OidcUpdateOidcCustomSubTemplateForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun oidcUpdateOidcCustomSubTemplateForOrg(
    request: InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b,
    org: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.executeWithTypedErrors<InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b, OidcUpdateOidcCustomSubTemplateForOrgResponse, JsonObject>(
    request = SdkExecutionRequest(oidcUpdateOidcCustomSubTemplateForOrgMetadata, baseUri, request, listOf(OidcCodecs.OIDCUPDATEOIDCCUSTOMSUBTEMPLATEFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = OidcCodecs.oidcUpdateOidcCustomSubTemplateForOrgRequestCodecRegistry,
    responseDecoder = OidcUpdateOidcCustomSubTemplateForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.SuccessJson -> response.json
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.Http403Json -> OidcUpdateOidcCustomSubTemplateForOrgApiException(response, statusCode, headers)
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.Http404Json -> OidcUpdateOidcCustomSubTemplateForOrgApiException(response, statusCode, headers)
        is OidcUpdateOidcCustomSubTemplateForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates or updates the customization template for an OpenID Connect (OIDC) subject claim.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun oidcUpdateOidcCustomSubTemplateForOrgWithResponse(
    request: InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<OidcUpdateOidcCustomSubTemplateForOrgResponse> = executor.executeWithResponse<InlineOrgsActionsOidcCustomizationSubPutRequestJsonXbb945d6b, OidcUpdateOidcCustomSubTemplateForOrgResponse>(SdkExecutionRequest(oidcUpdateOidcCustomSubTemplateForOrgMetadata, baseUri, request, listOf(OidcCodecs.OIDCUPDATEOIDCCUSTOMSUBTEMPLATEFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), OidcCodecs.oidcUpdateOidcCustomSubTemplateForOrgRequestCodecRegistry, OidcUpdateOidcCustomSubTemplateForOrgResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `oidc/create-oidc-custom-property-inclusion-for-enterprise` may
   * expose through its typed API exception.
   */
  public sealed interface OidcCreateOidcCustomPropertyInclusionForEnterpriseError

  /**
   * Typed response alternatives for `oidc/create-oidc-custom-property-inclusion-for-enterprise`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse {
    public class SuccessJson(
      public val json: OidcCustomPropertyInclusion,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse,
        OidcCreateOidcCustomPropertyInclusionForEnterpriseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse,
        OidcCreateOidcCustomPropertyInclusionForEnterpriseError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse,
        OidcCreateOidcCustomPropertyInclusionForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse
  }

  /**
   * Raised by `oidc/create-oidc-custom-property-inclusion-for-enterprise` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcCreateOidcCustomPropertyInclusionForEnterpriseApiException(
    public val error: OidcCreateOidcCustomPropertyInclusionForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/create-oidc-custom-property-inclusion-for-enterprise")

  private object OidcCreateOidcCustomPropertyInclusionForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse> = when {
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.SuccessJson(
          json = OidcCodecs.oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative0Registry.select(listOf("oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http403Json(
          json = OidcCodecs.oidcCreateOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Registry.select(listOf("oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative3" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Http422NoContent(
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
    ): OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse = OidcCreateOidcCustomPropertyInclusionForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `oidc/create-oidc-custom-property-inclusion-for-org` may expose
   * through its typed API exception.
   */
  public sealed interface OidcCreateOidcCustomPropertyInclusionForOrgError

  /**
   * Typed response alternatives for `oidc/create-oidc-custom-property-inclusion-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface OidcCreateOidcCustomPropertyInclusionForOrgResponse {
    public class SuccessJson(
      public val json: OidcCustomPropertyInclusion,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForOrgResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForOrgResponse,
        OidcCreateOidcCustomPropertyInclusionForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForOrgResponse,
        OidcCreateOidcCustomPropertyInclusionForOrgError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForOrgResponse,
        OidcCreateOidcCustomPropertyInclusionForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcCreateOidcCustomPropertyInclusionForOrgResponse
  }

  /**
   * Raised by `oidc/create-oidc-custom-property-inclusion-for-org` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcCreateOidcCustomPropertyInclusionForOrgApiException(
    public val error: OidcCreateOidcCustomPropertyInclusionForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/create-oidc-custom-property-inclusion-for-org")

  private object OidcCreateOidcCustomPropertyInclusionForOrgResponseDecoder : SdkResponseAlternativeDecoder<OidcCreateOidcCustomPropertyInclusionForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcCreateOidcCustomPropertyInclusionForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcCreateOidcCustomPropertyInclusionForOrgResponse> = when {
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForOrgResponse.SuccessJson(
          json = OidcCodecs.oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative0Registry.select(listOf("oidc/create-oidc-custom-property-inclusion-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http403Json(
          json = OidcCodecs.oidcCreateOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Registry.select(listOf("oidc/create-oidc-custom-property-inclusion-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = OidcCreateOidcCustomPropertyInclusionForOrgResponse.Http422NoContent(
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
    ): OidcCreateOidcCustomPropertyInclusionForOrgResponse = OidcCreateOidcCustomPropertyInclusionForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `oidc/delete-oidc-custom-property-inclusion-for-enterprise` may
   * expose through its typed API exception.
   */
  public sealed interface OidcDeleteOidcCustomPropertyInclusionForEnterpriseError

  /**
   * Typed response alternatives for `oidc/delete-oidc-custom-property-inclusion-for-enterprise`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse,
        OidcDeleteOidcCustomPropertyInclusionForEnterpriseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse,
        OidcDeleteOidcCustomPropertyInclusionForEnterpriseError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse,
        OidcDeleteOidcCustomPropertyInclusionForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse
  }

  /**
   * Raised by `oidc/delete-oidc-custom-property-inclusion-for-enterprise` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcDeleteOidcCustomPropertyInclusionForEnterpriseApiException(
    public val error: OidcDeleteOidcCustomPropertyInclusionForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/delete-oidc-custom-property-inclusion-for-enterprise")

  private object OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse> = when {
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http403Json(
          json = OidcCodecs.oidcDeleteOidcCustomPropertyInclusionForEnterpriseResponseCodecAlternative2Registry.select(listOf("oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative3" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Http404NoContent(
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
    ): OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse = OidcDeleteOidcCustomPropertyInclusionForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `oidc/delete-oidc-custom-property-inclusion-for-org` may expose
   * through its typed API exception.
   */
  public sealed interface OidcDeleteOidcCustomPropertyInclusionForOrgError

  /**
   * Typed response alternatives for `oidc/delete-oidc-custom-property-inclusion-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface OidcDeleteOidcCustomPropertyInclusionForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForOrgResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForOrgResponse,
        OidcDeleteOidcCustomPropertyInclusionForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForOrgResponse,
        OidcDeleteOidcCustomPropertyInclusionForOrgError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForOrgResponse,
        OidcDeleteOidcCustomPropertyInclusionForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcDeleteOidcCustomPropertyInclusionForOrgResponse
  }

  /**
   * Raised by `oidc/delete-oidc-custom-property-inclusion-for-org` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcDeleteOidcCustomPropertyInclusionForOrgApiException(
    public val error: OidcDeleteOidcCustomPropertyInclusionForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/delete-oidc-custom-property-inclusion-for-org")

  private object OidcDeleteOidcCustomPropertyInclusionForOrgResponseDecoder : SdkResponseAlternativeDecoder<OidcDeleteOidcCustomPropertyInclusionForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcDeleteOidcCustomPropertyInclusionForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcDeleteOidcCustomPropertyInclusionForOrgResponse> = when {
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http403Json(
          json = OidcCodecs.oidcDeleteOidcCustomPropertyInclusionForOrgResponseCodecAlternative2Registry.select(listOf("oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Http404NoContent(
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
    ): OidcDeleteOidcCustomPropertyInclusionForOrgResponse = OidcDeleteOidcCustomPropertyInclusionForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `oidc/get-oidc-custom-sub-template-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface OidcGetOidcCustomSubTemplateForOrgResponse {
    public class SuccessJson(
      public val json: OidcCustomSub,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcGetOidcCustomSubTemplateForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcGetOidcCustomSubTemplateForOrgResponse
  }

  private object OidcGetOidcCustomSubTemplateForOrgResponseDecoder : SdkResponseAlternativeDecoder<OidcGetOidcCustomSubTemplateForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcGetOidcCustomSubTemplateForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcGetOidcCustomSubTemplateForOrgResponse> = when {
      alternative.id == "oidc/get-oidc-custom-sub-template-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcGetOidcCustomSubTemplateForOrgResponse.SuccessJson(
          json = OidcCodecs.oidcGetOidcCustomSubTemplateForOrgResponseCodecAlternative0Registry.select(listOf("oidc/get-oidc-custom-sub-template-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): OidcGetOidcCustomSubTemplateForOrgResponse = OidcGetOidcCustomSubTemplateForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `oidc/list-oidc-custom-property-inclusions-for-enterprise` may
   * expose through its typed API exception.
   */
  public sealed interface OidcListOidcCustomPropertyInclusionsForEnterpriseError

  /**
   * Typed response alternatives for `oidc/list-oidc-custom-property-inclusions-for-enterprise`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface OidcListOidcCustomPropertyInclusionsForEnterpriseResponse {
    public class SuccessJson(
      public val json: List<OidcCustomPropertyInclusion>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForEnterpriseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForEnterpriseResponse,
        OidcListOidcCustomPropertyInclusionsForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForEnterpriseResponse,
        OidcListOidcCustomPropertyInclusionsForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForEnterpriseResponse
  }

  /**
   * Raised by `oidc/list-oidc-custom-property-inclusions-for-enterprise` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcListOidcCustomPropertyInclusionsForEnterpriseApiException(
    public val error: OidcListOidcCustomPropertyInclusionsForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/list-oidc-custom-property-inclusions-for-enterprise")

  private object OidcListOidcCustomPropertyInclusionsForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<OidcListOidcCustomPropertyInclusionsForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcListOidcCustomPropertyInclusionsForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcListOidcCustomPropertyInclusionsForEnterpriseResponse> = when {
      alternative.id == "oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.SuccessJson(
          json = OidcCodecs.oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative0Registry.select(listOf("oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Http403Json(
          json = OidcCodecs.oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative1Registry.select(listOf("oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Http404Json(
          json = OidcCodecs.oidcListOidcCustomPropertyInclusionsForEnterpriseResponseCodecAlternative2Registry.select(listOf("oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): OidcListOidcCustomPropertyInclusionsForEnterpriseResponse = OidcListOidcCustomPropertyInclusionsForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `oidc/list-oidc-custom-property-inclusions-for-org` may expose
   * through its typed API exception.
   */
  public sealed interface OidcListOidcCustomPropertyInclusionsForOrgError

  /**
   * Typed response alternatives for `oidc/list-oidc-custom-property-inclusions-for-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface OidcListOidcCustomPropertyInclusionsForOrgResponse {
    public class SuccessJson(
      public val json: List<OidcCustomPropertyInclusion>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForOrgResponse,
        OidcListOidcCustomPropertyInclusionsForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForOrgResponse,
        OidcListOidcCustomPropertyInclusionsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcListOidcCustomPropertyInclusionsForOrgResponse
  }

  /**
   * Raised by `oidc/list-oidc-custom-property-inclusions-for-org` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcListOidcCustomPropertyInclusionsForOrgApiException(
    public val error: OidcListOidcCustomPropertyInclusionsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/list-oidc-custom-property-inclusions-for-org")

  private object OidcListOidcCustomPropertyInclusionsForOrgResponseDecoder : SdkResponseAlternativeDecoder<OidcListOidcCustomPropertyInclusionsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcListOidcCustomPropertyInclusionsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcListOidcCustomPropertyInclusionsForOrgResponse> = when {
      alternative.id == "oidc/list-oidc-custom-property-inclusions-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcListOidcCustomPropertyInclusionsForOrgResponse.SuccessJson(
          json = OidcCodecs.oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative0Registry.select(listOf("oidc/list-oidc-custom-property-inclusions-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/list-oidc-custom-property-inclusions-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcListOidcCustomPropertyInclusionsForOrgResponse.Http403Json(
          json = OidcCodecs.oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative1Registry.select(listOf("oidc/list-oidc-custom-property-inclusions-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/list-oidc-custom-property-inclusions-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcListOidcCustomPropertyInclusionsForOrgResponse.Http404Json(
          json = OidcCodecs.oidcListOidcCustomPropertyInclusionsForOrgResponseCodecAlternative2Registry.select(listOf("oidc/list-oidc-custom-property-inclusions-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): OidcListOidcCustomPropertyInclusionsForOrgResponse = OidcListOidcCustomPropertyInclusionsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `oidc/update-oidc-custom-sub-template-for-org` may expose through
   * its typed API exception.
   */
  public sealed interface OidcUpdateOidcCustomSubTemplateForOrgError

  /**
   * Typed response alternatives for `oidc/update-oidc-custom-sub-template-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface OidcUpdateOidcCustomSubTemplateForOrgResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcUpdateOidcCustomSubTemplateForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcUpdateOidcCustomSubTemplateForOrgResponse,
        OidcUpdateOidcCustomSubTemplateForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcUpdateOidcCustomSubTemplateForOrgResponse,
        OidcUpdateOidcCustomSubTemplateForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : OidcUpdateOidcCustomSubTemplateForOrgResponse
  }

  /**
   * Raised by `oidc/update-oidc-custom-sub-template-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class OidcUpdateOidcCustomSubTemplateForOrgApiException(
    public val error: OidcUpdateOidcCustomSubTemplateForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "oidc/update-oidc-custom-sub-template-for-org")

  private object OidcUpdateOidcCustomSubTemplateForOrgResponseDecoder : SdkResponseAlternativeDecoder<OidcUpdateOidcCustomSubTemplateForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): OidcUpdateOidcCustomSubTemplateForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<OidcUpdateOidcCustomSubTemplateForOrgResponse> = when {
      alternative.id == "oidc/update-oidc-custom-sub-template-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = OidcUpdateOidcCustomSubTemplateForOrgResponse.SuccessJson(
          json = OidcCodecs.oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative0Registry.select(listOf("oidc/update-oidc-custom-sub-template-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/update-oidc-custom-sub-template-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = OidcUpdateOidcCustomSubTemplateForOrgResponse.Http403Json(
          json = OidcCodecs.oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative1Registry.select(listOf("oidc/update-oidc-custom-sub-template-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "oidc/update-oidc-custom-sub-template-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = OidcUpdateOidcCustomSubTemplateForOrgResponse.Http404Json(
          json = OidcCodecs.oidcUpdateOidcCustomSubTemplateForOrgResponseCodecAlternative2Registry.select(listOf("oidc/update-oidc-custom-sub-template-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): OidcUpdateOidcCustomSubTemplateForOrgResponse = OidcUpdateOidcCustomSubTemplateForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val oidcCreateOidcCustomPropertyInclusionForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/create-oidc-custom-property-inclusion-for-enterprise",
          method = "POST",
          path = "/enterprises/{enterprise}/actions/oidc/customization/properties/repo",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "OidcCustomPropertyInclusion",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-enterprise.response.alternative3",
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

    internal val oidcCreateOidcCustomPropertyInclusionForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/create-oidc-custom-property-inclusion-for-org",
          method = "POST",
          path = "/orgs/{org}/actions/oidc/customization/properties/repo",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "OidcCustomPropertyInclusion",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/create-oidc-custom-property-inclusion-for-org.response.alternative3",
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

    internal val oidcDeleteOidcCustomPropertyInclusionForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/delete-oidc-custom-property-inclusion-for-enterprise",
          method = "DELETE",
          path = "/enterprises/{enterprise}/actions/oidc/customization/properties/repo/{custom_property_name}",
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
              id = "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/delete-oidc-custom-property-inclusion-for-enterprise.response.alternative3",
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

    internal val oidcDeleteOidcCustomPropertyInclusionForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/delete-oidc-custom-property-inclusion-for-org",
          method = "DELETE",
          path = "/orgs/{org}/actions/oidc/customization/properties/repo/{custom_property_name}",
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
              id = "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/delete-oidc-custom-property-inclusion-for-org.response.alternative3",
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

    internal val oidcGetOidcCustomSubTemplateForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/get-oidc-custom-sub-template-for-org",
          method = "GET",
          path = "/orgs/{org}/actions/oidc/customization/sub",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OidcCustomSub",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/get-oidc-custom-sub-template-for-org.response.alternative0",
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

    internal val oidcListOidcCustomPropertyInclusionsForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/list-oidc-custom-property-inclusions-for-enterprise",
          method = "GET",
          path = "/enterprises/{enterprise}/actions/oidc/customization/properties/repo",
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
              id = "oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/list-oidc-custom-property-inclusions-for-enterprise.response.alternative2",
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

    internal val oidcListOidcCustomPropertyInclusionsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/list-oidc-custom-property-inclusions-for-org",
          method = "GET",
          path = "/orgs/{org}/actions/oidc/customization/properties/repo",
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
              id = "oidc/list-oidc-custom-property-inclusions-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/list-oidc-custom-property-inclusions-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/list-oidc-custom-property-inclusions-for-org.response.alternative2",
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

    internal val oidcUpdateOidcCustomSubTemplateForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "oidc/update-oidc-custom-sub-template-for-org",
          method = "PUT",
          path = "/orgs/{org}/actions/oidc/customization/sub",
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
              id = "oidc/update-oidc-custom-sub-template-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/update-oidc-custom-sub-template-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "oidc/update-oidc-custom-sub-template-for-org.response.alternative2",
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
  }
}
