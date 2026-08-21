package com.nabobery.sdkgen.generated.stripe.reporting

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportRunsGetParameterX7313b56f
import com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportRunsGetResponse200JsonX69aeb026
import com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3
import com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportTypesGetResponse200JsonX9ffd143b
import com.nabobery.sdkgen.generated.stripe.ReportingReportRun
import com.nabobery.sdkgen.generated.stripe.ReportingReportType
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
import kotlinx.serialization.json.JsonPrimitive

internal object ReportingCodecs {
  internal const val GETREPORTINGREPORTRUNS_REQUEST_CODEC_ID: String =
      "GetReportingReportRuns.request"

  private val getReportingReportRunsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetReportingReportRunsFormCodec

  private val getReportingReportRunsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ReportingReportRunsGetResponse200JsonX69aeb026> =
      KotlinxSerializationCodec("GetReportingReportRuns.response.alternative0", InlineV1ReportingReportRunsGetResponse200JsonX69aeb026.Serializer, SdkJson)

  internal val getReportingReportRunsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ReportingReportRunsGetResponse200JsonX69aeb026> =
      MediaTypeCodecRegistry.of(getReportingReportRunsResponseCodecAlternative0Codec)

  private val getReportingReportRunsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetReportingReportRuns.response.alternative1", Error.Serializer, SdkJson)

  internal val getReportingReportRunsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getReportingReportRunsResponseCodecAlternative1Codec)

  internal val getReportingReportRunsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getReportingReportRunsRequestCodec)

  internal const val GETREPORTINGREPORTRUNSREPORTRUN_REQUEST_CODEC_ID: String =
      "GetReportingReportRunsReportRun.request"

  private val getReportingReportRunsReportRunRequestCodec: MediaTypeCodec<JsonObject?> =
      GetReportingReportRunsReportRunFormCodec

  private val getReportingReportRunsReportRunResponseCodecAlternative0Codec:
      MediaTypeCodec<ReportingReportRun> =
      KotlinxSerializationCodec("GetReportingReportRunsReportRun.response.alternative0", ReportingReportRun.Serializer, SdkJson)

  internal val getReportingReportRunsReportRunResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ReportingReportRun> =
      MediaTypeCodecRegistry.of(getReportingReportRunsReportRunResponseCodecAlternative0Codec)

  private val getReportingReportRunsReportRunResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetReportingReportRunsReportRun.response.alternative1", Error.Serializer, SdkJson)

  internal val getReportingReportRunsReportRunResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getReportingReportRunsReportRunResponseCodecAlternative1Codec)

  internal val getReportingReportRunsReportRunRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getReportingReportRunsReportRunRequestCodec)

  internal const val GETREPORTINGREPORTTYPES_REQUEST_CODEC_ID: String =
      "GetReportingReportTypes.request"

  private val getReportingReportTypesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetReportingReportTypesFormCodec

  private val getReportingReportTypesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ReportingReportTypesGetResponse200JsonX9ffd143b> =
      KotlinxSerializationCodec("GetReportingReportTypes.response.alternative0", InlineV1ReportingReportTypesGetResponse200JsonX9ffd143b.Serializer, SdkJson)

  internal val getReportingReportTypesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ReportingReportTypesGetResponse200JsonX9ffd143b> =
      MediaTypeCodecRegistry.of(getReportingReportTypesResponseCodecAlternative0Codec)

  private val getReportingReportTypesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetReportingReportTypes.response.alternative1", Error.Serializer, SdkJson)

  internal val getReportingReportTypesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getReportingReportTypesResponseCodecAlternative1Codec)

  internal val getReportingReportTypesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getReportingReportTypesRequestCodec)

  internal const val GETREPORTINGREPORTTYPESREPORTTYPE_REQUEST_CODEC_ID: String =
      "GetReportingReportTypesReportType.request"

  private val getReportingReportTypesReportTypeRequestCodec: MediaTypeCodec<JsonObject?> =
      GetReportingReportTypesReportTypeFormCodec

  private val getReportingReportTypesReportTypeResponseCodecAlternative0Codec:
      MediaTypeCodec<ReportingReportType> =
      KotlinxSerializationCodec("GetReportingReportTypesReportType.response.alternative0", ReportingReportType.Serializer, SdkJson)

  internal val getReportingReportTypesReportTypeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ReportingReportType> =
      MediaTypeCodecRegistry.of(getReportingReportTypesReportTypeResponseCodecAlternative0Codec)

  private val getReportingReportTypesReportTypeResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetReportingReportTypesReportType.response.alternative1", Error.Serializer, SdkJson)

  internal val getReportingReportTypesReportTypeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getReportingReportTypesReportTypeResponseCodecAlternative1Codec)

  internal val getReportingReportTypesReportTypeRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getReportingReportTypesReportTypeRequestCodec)

  internal const val POSTREPORTINGREPORTRUNS_REQUEST_CODEC_ID: String =
      "PostReportingReportRuns.request"

  private val postReportingReportRunsRequestCodec:
      MediaTypeCodec<InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3> =
      PostReportingReportRunsFormCodec

  private val postReportingReportRunsResponseCodecAlternative0Codec:
      MediaTypeCodec<ReportingReportRun> =
      KotlinxSerializationCodec("PostReportingReportRuns.response.alternative0", ReportingReportRun.Serializer, SdkJson)

  internal val postReportingReportRunsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ReportingReportRun> =
      MediaTypeCodecRegistry.of(postReportingReportRunsResponseCodecAlternative0Codec)

  private val postReportingReportRunsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostReportingReportRuns.response.alternative1", Error.Serializer, SdkJson)

  internal val postReportingReportRunsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postReportingReportRunsResponseCodecAlternative1Codec)

  internal val postReportingReportRunsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3> =
      MediaTypeCodecRegistry.of(postReportingReportRunsRequestCodec)

  internal object GetReportingReportRunsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetReportingReportRuns.request"

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

  internal object GetReportingReportRunsReportRunFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetReportingReportRunsReportRun.request"

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

  internal object GetReportingReportTypesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetReportingReportTypes.request"

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

  internal object GetReportingReportTypesReportTypeFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetReportingReportTypesReportType.request"

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

  internal object PostReportingReportRunsFormCodec : MediaTypeCodec<InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3> {
    override val id: String = "PostReportingReportRuns.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.parameters?.let { formValue0 ->
        formValue0.columns?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("parameters" + "[columns]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("parameters" + "[columns]" + "[" + formIndex3 + "]", formElement3)
            }
          }
        }
        formValue0.connectedAccount?.let { formValue2 ->
          form.add("parameters" + "[connected_account]", formValue2)
        }
        formValue0.currency?.let { formValue2 ->
          form.add("parameters" + "[currency]", formValue2)
        }
        formValue0.intervalEnd?.let { formValue2 ->
          form.add("parameters" + "[interval_end]", formValue2.toString())
        }
        formValue0.intervalStart?.let { formValue2 ->
          form.add("parameters" + "[interval_start]", formValue2.toString())
        }
        formValue0.payout?.let { formValue2 ->
          form.add("parameters" + "[payout]", formValue2)
        }
        formValue0.reportingCategory?.let { formValue2 ->
          form.add("parameters" + "[reporting_category]", formValue2.value)
        }
        formValue0.timezone?.let { formValue2 ->
          form.add("parameters" + "[timezone]", formValue2.value)
        }
      }
      form.add("report_type", request.reportType)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'reporting' group of Stripe API.
 */
public class ReportingClient(
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
      SdkExecutor(transport, authentication = this@ReportingClient.authentication)

  /**
   * <p>Returns a list of Report Runs, with the most recent appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return Report Runs that were created during the given date interval.
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
  public suspend fun getReportingReportRunsWithResponse(
    request: JsonObject? = null,
    created: InlineV1ReportingReportRunsGetParameterX7313b56f? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetReportingReportRunsResponse> = executor.executeWithResponse<JsonObject?, GetReportingReportRunsResponse>(SdkExecutionRequest(getReportingReportRunsMetadata, baseUri, request, listOf(ReportingCodecs.GETREPORTINGREPORTRUNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ReportingCodecs.getReportingReportRunsRequestCodecRegistry, GetReportingReportRunsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing Report Run.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reportRun Wire parameter `report_run`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getReportingReportRunsReportRunWithResponse(
    request: JsonObject? = null,
    reportRun: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetReportingReportRunsReportRunResponse> = executor.executeWithResponse<JsonObject?, GetReportingReportRunsReportRunResponse>(SdkExecutionRequest(getReportingReportRunsReportRunMetadata, baseUri, request, listOf(ReportingCodecs.GETREPORTINGREPORTRUNSREPORTRUN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "report_run", values = listOf(reportRun.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ReportingCodecs.getReportingReportRunsReportRunRequestCodecRegistry, GetReportingReportRunsReportRunResponseDecoder, options)

  /**
   * <p>Returns a full list of Report Types.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getReportingReportTypesWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetReportingReportTypesResponse> = executor.executeWithResponse<JsonObject?, GetReportingReportTypesResponse>(SdkExecutionRequest(getReportingReportTypesMetadata, baseUri, request, listOf(ReportingCodecs.GETREPORTINGREPORTTYPES_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ReportingCodecs.getReportingReportTypesRequestCodecRegistry, GetReportingReportTypesResponseDecoder, options)

  /**
   * <p>Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reportType Wire parameter `report_type`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getReportingReportTypesReportTypeWithResponse(
    request: JsonObject? = null,
    reportType: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetReportingReportTypesReportTypeResponse> = executor.executeWithResponse<JsonObject?, GetReportingReportTypesReportTypeResponse>(SdkExecutionRequest(getReportingReportTypesReportTypeMetadata, baseUri, request, listOf(ReportingCodecs.GETREPORTINGREPORTTYPESREPORTTYPE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "report_type", values = listOf(reportType.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ReportingCodecs.getReportingReportTypesReportTypeRequestCodecRegistry, GetReportingReportTypesReportTypeResponseDecoder, options)

  /**
   * <p>Creates a new object and begin running the report. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postReportingReportRunsWithResponse(request: InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3, options: CallOptions = CallOptions()): SdkResponseResult<PostReportingReportRunsResponse> = executor.executeWithResponse<InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3, PostReportingReportRunsResponse>(SdkExecutionRequest(postReportingReportRunsMetadata, baseUri, request, listOf(ReportingCodecs.POSTREPORTINGREPORTRUNS_REQUEST_CODEC_ID), emptyList()), ReportingCodecs.postReportingReportRunsRequestCodecRegistry, PostReportingReportRunsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetReportingReportRuns`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetReportingReportRunsResponse {
    public class SuccessJson(
      public val json: InlineV1ReportingReportRunsGetResponse200JsonX69aeb026,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportRunsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportRunsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportRunsResponse
  }

  private object GetReportingReportRunsResponseDecoder : SdkResponseAlternativeDecoder<GetReportingReportRunsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetReportingReportRunsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetReportingReportRunsResponse> = when {
      alternative.id == "GetReportingReportRuns.response.alternative0" -> SdkResponseDecodeResult(
        value = GetReportingReportRunsResponse.SuccessJson(
          json = ReportingCodecs.getReportingReportRunsResponseCodecAlternative0Registry.select(listOf("GetReportingReportRuns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetReportingReportRuns.response.alternative1" -> SdkResponseDecodeResult(
        value = GetReportingReportRunsResponse.DefaultJson(
          json = ReportingCodecs.getReportingReportRunsResponseCodecAlternative1Registry.select(listOf("GetReportingReportRuns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetReportingReportRunsResponse = GetReportingReportRunsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetReportingReportRunsReportRun`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetReportingReportRunsReportRunResponse {
    public class SuccessJson(
      public val json: ReportingReportRun,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportRunsReportRunResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportRunsReportRunResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportRunsReportRunResponse
  }

  private object GetReportingReportRunsReportRunResponseDecoder : SdkResponseAlternativeDecoder<GetReportingReportRunsReportRunResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetReportingReportRunsReportRunResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetReportingReportRunsReportRunResponse> = when {
      alternative.id == "GetReportingReportRunsReportRun.response.alternative0" -> SdkResponseDecodeResult(
        value = GetReportingReportRunsReportRunResponse.SuccessJson(
          json = ReportingCodecs.getReportingReportRunsReportRunResponseCodecAlternative0Registry.select(listOf("GetReportingReportRunsReportRun.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetReportingReportRunsReportRun.response.alternative1" -> SdkResponseDecodeResult(
        value = GetReportingReportRunsReportRunResponse.DefaultJson(
          json = ReportingCodecs.getReportingReportRunsReportRunResponseCodecAlternative1Registry.select(listOf("GetReportingReportRunsReportRun.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetReportingReportRunsReportRunResponse = GetReportingReportRunsReportRunResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetReportingReportTypes`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetReportingReportTypesResponse {
    public class SuccessJson(
      public val json: InlineV1ReportingReportTypesGetResponse200JsonX9ffd143b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportTypesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportTypesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportTypesResponse
  }

  private object GetReportingReportTypesResponseDecoder : SdkResponseAlternativeDecoder<GetReportingReportTypesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetReportingReportTypesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetReportingReportTypesResponse> = when {
      alternative.id == "GetReportingReportTypes.response.alternative0" -> SdkResponseDecodeResult(
        value = GetReportingReportTypesResponse.SuccessJson(
          json = ReportingCodecs.getReportingReportTypesResponseCodecAlternative0Registry.select(listOf("GetReportingReportTypes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetReportingReportTypes.response.alternative1" -> SdkResponseDecodeResult(
        value = GetReportingReportTypesResponse.DefaultJson(
          json = ReportingCodecs.getReportingReportTypesResponseCodecAlternative1Registry.select(listOf("GetReportingReportTypes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetReportingReportTypesResponse = GetReportingReportTypesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetReportingReportTypesReportType`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetReportingReportTypesReportTypeResponse {
    public class SuccessJson(
      public val json: ReportingReportType,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportTypesReportTypeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportTypesReportTypeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReportingReportTypesReportTypeResponse
  }

  private object GetReportingReportTypesReportTypeResponseDecoder : SdkResponseAlternativeDecoder<GetReportingReportTypesReportTypeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetReportingReportTypesReportTypeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetReportingReportTypesReportTypeResponse> = when {
      alternative.id == "GetReportingReportTypesReportType.response.alternative0" -> SdkResponseDecodeResult(
        value = GetReportingReportTypesReportTypeResponse.SuccessJson(
          json = ReportingCodecs.getReportingReportTypesReportTypeResponseCodecAlternative0Registry.select(listOf("GetReportingReportTypesReportType.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetReportingReportTypesReportType.response.alternative1" -> SdkResponseDecodeResult(
        value = GetReportingReportTypesReportTypeResponse.DefaultJson(
          json = ReportingCodecs.getReportingReportTypesReportTypeResponseCodecAlternative1Registry.select(listOf("GetReportingReportTypesReportType.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetReportingReportTypesReportTypeResponse = GetReportingReportTypesReportTypeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostReportingReportRuns`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostReportingReportRunsResponse {
    public class SuccessJson(
      public val json: ReportingReportRun,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostReportingReportRunsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostReportingReportRunsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostReportingReportRunsResponse
  }

  private object PostReportingReportRunsResponseDecoder : SdkResponseAlternativeDecoder<PostReportingReportRunsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostReportingReportRunsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostReportingReportRunsResponse> = when {
      alternative.id == "PostReportingReportRuns.response.alternative0" -> SdkResponseDecodeResult(
        value = PostReportingReportRunsResponse.SuccessJson(
          json = ReportingCodecs.postReportingReportRunsResponseCodecAlternative0Registry.select(listOf("PostReportingReportRuns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostReportingReportRuns.response.alternative1" -> SdkResponseDecodeResult(
        value = PostReportingReportRunsResponse.DefaultJson(
          json = ReportingCodecs.postReportingReportRunsResponseCodecAlternative1Registry.select(listOf("PostReportingReportRuns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostReportingReportRunsResponse = PostReportingReportRunsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getReportingReportRunsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetReportingReportRuns",
          method = "GET",
          path = "/v1/reporting/report_runs",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ReportingReportRunsGetResponse200JsonX69aeb026",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportRuns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportRuns.response.alternative1",
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

    internal val getReportingReportRunsReportRunMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetReportingReportRunsReportRun",
          method = "GET",
          path = "/v1/reporting/report_runs/{report_run}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ReportingReportRun",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportRunsReportRun.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportRunsReportRun.response.alternative1",
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

    internal val getReportingReportTypesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetReportingReportTypes",
          method = "GET",
          path = "/v1/reporting/report_types",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ReportingReportTypesGetResponse200JsonX9ffd143b",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportTypes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportTypes.response.alternative1",
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

    internal val getReportingReportTypesReportTypeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetReportingReportTypesReportType",
          method = "GET",
          path = "/v1/reporting/report_types/{report_type}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ReportingReportType",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportTypesReportType.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReportingReportTypesReportType.response.alternative1",
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

    internal val postReportingReportRunsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostReportingReportRuns",
          method = "POST",
          path = "/v1/reporting/report_runs",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ReportingReportRun",
              mode = SdkResponseMode.BUFFERED,
              id = "PostReportingReportRuns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostReportingReportRuns.response.alternative1",
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
