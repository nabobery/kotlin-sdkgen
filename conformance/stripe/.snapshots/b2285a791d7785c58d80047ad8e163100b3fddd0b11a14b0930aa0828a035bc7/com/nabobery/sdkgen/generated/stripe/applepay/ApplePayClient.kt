package com.nabobery.sdkgen.generated.stripe.applepay

import com.nabobery.sdkgen.generated.stripe.ApplePayDomain
import com.nabobery.sdkgen.generated.stripe.DeletedApplePayDomain
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplePayDomainsGetResponse200JsonXb67a19ac
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplePayDomainsPostRequestFormXfcb63491
import com.nabobery.sdkgen.generated.stripe.SdkJson
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
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

public object ApplePayCodecs {
  public const val DELETEAPPLEPAYDOMAINSDOMAIN_REQUEST_CODEC_ID: String =
      "DeleteApplePayDomainsDomain.request"

  private val deleteApplePayDomainsDomainRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteApplePayDomainsDomainFormCodec

  private val deleteApplePayDomainsDomainResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedApplePayDomain> =
      KotlinxSerializationCodec("DeleteApplePayDomainsDomain.response.alternative0", DeletedApplePayDomain.Serializer, SdkJson)

  public val deleteApplePayDomainsDomainResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedApplePayDomain> =
      MediaTypeCodecRegistry.of(deleteApplePayDomainsDomainResponseCodecAlternative0Codec)

  private val deleteApplePayDomainsDomainResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteApplePayDomainsDomain.response.alternative1", Error.Serializer, SdkJson)

  public val deleteApplePayDomainsDomainResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteApplePayDomainsDomainResponseCodecAlternative1Codec)

  public val deleteApplePayDomainsDomainRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteApplePayDomainsDomainRequestCodec)

  public const val GETAPPLEPAYDOMAINS_REQUEST_CODEC_ID: String = "GetApplePayDomains.request"

  private val getApplePayDomainsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetApplePayDomainsFormCodec

  private val getApplePayDomainsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ApplePayDomainsGetResponse200JsonXb67a19ac> =
      KotlinxSerializationCodec("GetApplePayDomains.response.alternative0", InlineV1ApplePayDomainsGetResponse200JsonXb67a19ac.Serializer, SdkJson)

  public val getApplePayDomainsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ApplePayDomainsGetResponse200JsonXb67a19ac> =
      MediaTypeCodecRegistry.of(getApplePayDomainsResponseCodecAlternative0Codec)

  private val getApplePayDomainsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetApplePayDomains.response.alternative1", Error.Serializer, SdkJson)

  public val getApplePayDomainsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getApplePayDomainsResponseCodecAlternative1Codec)

  public val getApplePayDomainsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getApplePayDomainsRequestCodec)

  public const val GETAPPLEPAYDOMAINSDOMAIN_REQUEST_CODEC_ID: String =
      "GetApplePayDomainsDomain.request"

  private val getApplePayDomainsDomainRequestCodec: MediaTypeCodec<JsonObject?> =
      GetApplePayDomainsDomainFormCodec

  private val getApplePayDomainsDomainResponseCodecAlternative0Codec: MediaTypeCodec<ApplePayDomain>
      =
      KotlinxSerializationCodec("GetApplePayDomainsDomain.response.alternative0", ApplePayDomain.Serializer, SdkJson)

  public val getApplePayDomainsDomainResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ApplePayDomain> =
      MediaTypeCodecRegistry.of(getApplePayDomainsDomainResponseCodecAlternative0Codec)

  private val getApplePayDomainsDomainResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetApplePayDomainsDomain.response.alternative1", Error.Serializer, SdkJson)

  public val getApplePayDomainsDomainResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getApplePayDomainsDomainResponseCodecAlternative1Codec)

  public val getApplePayDomainsDomainRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getApplePayDomainsDomainRequestCodec)

  public const val POSTAPPLEPAYDOMAINS_REQUEST_CODEC_ID: String = "PostApplePayDomains.request"

  private val postApplePayDomainsRequestCodec:
      MediaTypeCodec<InlineV1ApplePayDomainsPostRequestFormXfcb63491> = PostApplePayDomainsFormCodec

  private val postApplePayDomainsResponseCodecAlternative0Codec: MediaTypeCodec<ApplePayDomain> =
      KotlinxSerializationCodec("PostApplePayDomains.response.alternative0", ApplePayDomain.Serializer, SdkJson)

  public val postApplePayDomainsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ApplePayDomain> =
      MediaTypeCodecRegistry.of(postApplePayDomainsResponseCodecAlternative0Codec)

  private val postApplePayDomainsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostApplePayDomains.response.alternative1", Error.Serializer, SdkJson)

  public val postApplePayDomainsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postApplePayDomainsResponseCodecAlternative1Codec)

  public val postApplePayDomainsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ApplePayDomainsPostRequestFormXfcb63491> =
      MediaTypeCodecRegistry.of(postApplePayDomainsRequestCodec)

  public object DeleteApplePayDomainsDomainFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteApplePayDomainsDomain.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetApplePayDomainsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetApplePayDomains.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetApplePayDomainsDomainFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetApplePayDomainsDomain.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostApplePayDomainsFormCodec : MediaTypeCodec<InlineV1ApplePayDomainsPostRequestFormXfcb63491> {
    override val id: String = "PostApplePayDomains.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ApplePayDomainsPostRequestFormXfcb63491, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("domain_name", request.domainName)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ApplePayDomainsPostRequestFormXfcb63491 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'apple_pay' group of Stripe API.
 */
public class ApplePayClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ApplePayClient.authentication)

  /**
   * <p>Delete an apple pay domain.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param domain Wire parameter `domain`.
   * @param options Execution options.
   */
  public suspend fun deleteApplePayDomainsDomainWithResponse(
    request: JsonObject? = null,
    domain: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteApplePayDomainsDomainResponse> = executor.executeWithResponse<JsonObject?, DeleteApplePayDomainsDomainResponse>(SdkExecutionRequest(deleteApplePayDomainsDomainMetadata, baseUri, request, listOf(ApplePayCodecs.DELETEAPPLEPAYDOMAINSDOMAIN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "domain", values = listOf(domain.toString())))
  }), ApplePayCodecs.deleteApplePayDomainsDomainRequestCodecRegistry, DeleteApplePayDomainsDomainResponseDecoder, options)

  /**
   * <p>List apple pay domains.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param domainName Wire parameter `domain_name`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getApplePayDomainsWithResponse(
    request: JsonObject? = null,
    domainName: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetApplePayDomainsResponse> = executor.executeWithResponse<JsonObject?, GetApplePayDomainsResponse>(SdkExecutionRequest(getApplePayDomainsMetadata, baseUri, request, listOf(ApplePayCodecs.GETAPPLEPAYDOMAINS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "domain_name", values = domainName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ApplePayCodecs.getApplePayDomainsRequestCodecRegistry, GetApplePayDomainsResponseDecoder, options)

  /**
   * <p>Retrieve an apple pay domain.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param domain Wire parameter `domain`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getApplePayDomainsDomainWithResponse(
    request: JsonObject? = null,
    domain: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetApplePayDomainsDomainResponse> = executor.executeWithResponse<JsonObject?, GetApplePayDomainsDomainResponse>(SdkExecutionRequest(getApplePayDomainsDomainMetadata, baseUri, request, listOf(ApplePayCodecs.GETAPPLEPAYDOMAINSDOMAIN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "domain", values = listOf(domain.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ApplePayCodecs.getApplePayDomainsDomainRequestCodecRegistry, GetApplePayDomainsDomainResponseDecoder, options)

  /**
   * <p>Create an apple pay domain.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postApplePayDomainsWithResponse(request: InlineV1ApplePayDomainsPostRequestFormXfcb63491, options: CallOptions = CallOptions()): SdkResponseResult<PostApplePayDomainsResponse> = executor.executeWithResponse<InlineV1ApplePayDomainsPostRequestFormXfcb63491, PostApplePayDomainsResponse>(SdkExecutionRequest(postApplePayDomainsMetadata, baseUri, request, listOf(ApplePayCodecs.POSTAPPLEPAYDOMAINS_REQUEST_CODEC_ID), emptyList()), ApplePayCodecs.postApplePayDomainsRequestCodecRegistry, PostApplePayDomainsResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteApplePayDomainsDomain`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteApplePayDomainsDomainResponse {
    public class SuccessJson(
      public val json: DeletedApplePayDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteApplePayDomainsDomainResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteApplePayDomainsDomainResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteApplePayDomainsDomainResponse
  }

  private object DeleteApplePayDomainsDomainResponseDecoder : SdkResponseAlternativeDecoder<DeleteApplePayDomainsDomainResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteApplePayDomainsDomainResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteApplePayDomainsDomainResponse> = when {
      alternative.id == "DeleteApplePayDomainsDomain.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteApplePayDomainsDomainResponse.SuccessJson(
          json = ApplePayCodecs.deleteApplePayDomainsDomainResponseCodecAlternative0Registry.select(listOf("DeleteApplePayDomainsDomain.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteApplePayDomainsDomain.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteApplePayDomainsDomainResponse.DefaultJson(
          json = ApplePayCodecs.deleteApplePayDomainsDomainResponseCodecAlternative1Registry.select(listOf("DeleteApplePayDomainsDomain.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteApplePayDomainsDomainResponse = DeleteApplePayDomainsDomainResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetApplePayDomains`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetApplePayDomainsResponse {
    public class SuccessJson(
      public val json: InlineV1ApplePayDomainsGetResponse200JsonXb67a19ac,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplePayDomainsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplePayDomainsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplePayDomainsResponse
  }

  private object GetApplePayDomainsResponseDecoder : SdkResponseAlternativeDecoder<GetApplePayDomainsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetApplePayDomainsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetApplePayDomainsResponse> = when {
      alternative.id == "GetApplePayDomains.response.alternative0" -> SdkResponseDecodeResult(
        value = GetApplePayDomainsResponse.SuccessJson(
          json = ApplePayCodecs.getApplePayDomainsResponseCodecAlternative0Registry.select(listOf("GetApplePayDomains.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetApplePayDomains.response.alternative1" -> SdkResponseDecodeResult(
        value = GetApplePayDomainsResponse.DefaultJson(
          json = ApplePayCodecs.getApplePayDomainsResponseCodecAlternative1Registry.select(listOf("GetApplePayDomains.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetApplePayDomainsResponse = GetApplePayDomainsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetApplePayDomainsDomain`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetApplePayDomainsDomainResponse {
    public class SuccessJson(
      public val json: ApplePayDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplePayDomainsDomainResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplePayDomainsDomainResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplePayDomainsDomainResponse
  }

  private object GetApplePayDomainsDomainResponseDecoder : SdkResponseAlternativeDecoder<GetApplePayDomainsDomainResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetApplePayDomainsDomainResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetApplePayDomainsDomainResponse> = when {
      alternative.id == "GetApplePayDomainsDomain.response.alternative0" -> SdkResponseDecodeResult(
        value = GetApplePayDomainsDomainResponse.SuccessJson(
          json = ApplePayCodecs.getApplePayDomainsDomainResponseCodecAlternative0Registry.select(listOf("GetApplePayDomainsDomain.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetApplePayDomainsDomain.response.alternative1" -> SdkResponseDecodeResult(
        value = GetApplePayDomainsDomainResponse.DefaultJson(
          json = ApplePayCodecs.getApplePayDomainsDomainResponseCodecAlternative1Registry.select(listOf("GetApplePayDomainsDomain.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetApplePayDomainsDomainResponse = GetApplePayDomainsDomainResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostApplePayDomains`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostApplePayDomainsResponse {
    public class SuccessJson(
      public val json: ApplePayDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplePayDomainsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplePayDomainsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplePayDomainsResponse
  }

  private object PostApplePayDomainsResponseDecoder : SdkResponseAlternativeDecoder<PostApplePayDomainsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostApplePayDomainsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostApplePayDomainsResponse> = when {
      alternative.id == "PostApplePayDomains.response.alternative0" -> SdkResponseDecodeResult(
        value = PostApplePayDomainsResponse.SuccessJson(
          json = ApplePayCodecs.postApplePayDomainsResponseCodecAlternative0Registry.select(listOf("PostApplePayDomains.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostApplePayDomains.response.alternative1" -> SdkResponseDecodeResult(
        value = PostApplePayDomainsResponse.DefaultJson(
          json = ApplePayCodecs.postApplePayDomainsResponseCodecAlternative1Registry.select(listOf("PostApplePayDomains.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostApplePayDomainsResponse = PostApplePayDomainsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteApplePayDomainsDomainMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteApplePayDomainsDomain",
          method = "DELETE",
          path = "/v1/apple_pay/domains/{domain}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedApplePayDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteApplePayDomainsDomain.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteApplePayDomainsDomain.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    public val getApplePayDomainsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetApplePayDomains",
          method = "GET",
          path = "/v1/apple_pay/domains",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ApplePayDomainsGetResponse200JsonXb67a19ac",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplePayDomains.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplePayDomains.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    public val getApplePayDomainsDomainMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetApplePayDomainsDomain",
          method = "GET",
          path = "/v1/apple_pay/domains/{domain}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ApplePayDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplePayDomainsDomain.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplePayDomainsDomain.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    public val postApplePayDomainsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostApplePayDomains",
          method = "POST",
          path = "/v1/apple_pay/domains",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ApplePayDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplePayDomains.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplePayDomains.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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
