package io.github.nabobery.sdkgen.generated.stripe.quotes

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
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesAcceptPostRequestFormXaa798ec4
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesCancelPostRequestFormX8d474b3c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonX5c9b58d8
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesFinalizePostRequestFormX0f68eddb
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesGetParameterX941558cc
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesGetResponse200JsonX586a0cec
import io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesLineItemsGetResponse200JsonXf4a9fe37
import io.github.nabobery.sdkgen.generated.stripe.Quote
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

internal object QuotesCodecs {
  internal const val GETQUOTES_REQUEST_CODEC_ID: String = "GetQuotes.request"

  private val getQuotesRequestCodec: MediaTypeCodec<JsonObject?> = GetQuotesFormCodec

  private val getQuotesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1QuotesGetResponse200JsonX586a0cec> =
      KotlinxSerializationCodec("GetQuotes.response.alternative0", InlineV1QuotesGetResponse200JsonX586a0cec.Serializer, SdkJson)

  internal val getQuotesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1QuotesGetResponse200JsonX586a0cec> =
      MediaTypeCodecRegistry.of(getQuotesResponseCodecAlternative0Codec)

  private val getQuotesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetQuotes.response.alternative1", Error.Serializer, SdkJson)

  internal val getQuotesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getQuotesResponseCodecAlternative1Codec)

  internal val getQuotesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getQuotesRequestCodec)

  internal const val GETQUOTESQUOTE_REQUEST_CODEC_ID: String = "GetQuotesQuote.request"

  private val getQuotesQuoteRequestCodec: MediaTypeCodec<JsonObject?> = GetQuotesQuoteFormCodec

  private val getQuotesQuoteResponseCodecAlternative0Codec: MediaTypeCodec<Quote> =
      KotlinxSerializationCodec("GetQuotesQuote.response.alternative0", Quote.Serializer, SdkJson)

  internal val getQuotesQuoteResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Quote> =
      MediaTypeCodecRegistry.of(getQuotesQuoteResponseCodecAlternative0Codec)

  private val getQuotesQuoteResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetQuotesQuote.response.alternative1", Error.Serializer, SdkJson)

  internal val getQuotesQuoteResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getQuotesQuoteResponseCodecAlternative1Codec)

  internal val getQuotesQuoteRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getQuotesQuoteRequestCodec)

  internal const val GETQUOTESQUOTECOMPUTEDUPFRONTLINEITEMS_REQUEST_CODEC_ID: String =
      "GetQuotesQuoteComputedUpfrontLineItems.request"

  private val getQuotesQuoteComputedUpfrontLineItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetQuotesQuoteComputedUpfrontLineItemsFormCodec

  private val getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonX5c9b58d8> =
      KotlinxSerializationCodec("GetQuotesQuoteComputedUpfrontLineItems.response.alternative0", InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonX5c9b58d8.Serializer, SdkJson)

  internal val getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonX5c9b58d8> =
      MediaTypeCodecRegistry.of(getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative0Codec)

  private val getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetQuotesQuoteComputedUpfrontLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative1Codec)

  internal val getQuotesQuoteComputedUpfrontLineItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getQuotesQuoteComputedUpfrontLineItemsRequestCodec)

  internal const val GETQUOTESQUOTELINEITEMS_REQUEST_CODEC_ID: String =
      "GetQuotesQuoteLineItems.request"

  private val getQuotesQuoteLineItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetQuotesQuoteLineItemsFormCodec

  private val getQuotesQuoteLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1QuotesLineItemsGetResponse200JsonXf4a9fe37> =
      KotlinxSerializationCodec("GetQuotesQuoteLineItems.response.alternative0", InlineV1QuotesLineItemsGetResponse200JsonXf4a9fe37.Serializer, SdkJson)

  internal val getQuotesQuoteLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1QuotesLineItemsGetResponse200JsonXf4a9fe37> =
      MediaTypeCodecRegistry.of(getQuotesQuoteLineItemsResponseCodecAlternative0Codec)

  private val getQuotesQuoteLineItemsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetQuotesQuoteLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getQuotesQuoteLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getQuotesQuoteLineItemsResponseCodecAlternative1Codec)

  internal val getQuotesQuoteLineItemsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getQuotesQuoteLineItemsRequestCodec)

  internal const val GETQUOTESQUOTEPDF_REQUEST_CODEC_ID: String = "GetQuotesQuotePdf.request"

  private val getQuotesQuotePdfRequestCodec: MediaTypeCodec<JsonObject?> =
      GetQuotesQuotePdfFormCodec

  private val getQuotesQuotePdfResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetQuotesQuotePdf.response.alternative1", Error.Serializer, SdkJson)

  internal val getQuotesQuotePdfResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getQuotesQuotePdfResponseCodecAlternative1Codec)

  internal val getQuotesQuotePdfRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getQuotesQuotePdfRequestCodec)

  internal const val POSTQUOTESQUOTEACCEPT_REQUEST_CODEC_ID: String =
      "PostQuotesQuoteAccept.request"

  private val postQuotesQuoteAcceptRequestCodec:
      MediaTypeCodec<InlineV1QuotesAcceptPostRequestFormXaa798ec4?> = PostQuotesQuoteAcceptFormCodec

  private val postQuotesQuoteAcceptResponseCodecAlternative0Codec: MediaTypeCodec<Quote> =
      KotlinxSerializationCodec("PostQuotesQuoteAccept.response.alternative0", Quote.Serializer, SdkJson)

  internal val postQuotesQuoteAcceptResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Quote>
      = MediaTypeCodecRegistry.of(postQuotesQuoteAcceptResponseCodecAlternative0Codec)

  private val postQuotesQuoteAcceptResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostQuotesQuoteAccept.response.alternative1", Error.Serializer, SdkJson)

  internal val postQuotesQuoteAcceptResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postQuotesQuoteAcceptResponseCodecAlternative1Codec)

  internal val postQuotesQuoteAcceptRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1QuotesAcceptPostRequestFormXaa798ec4?> =
      MediaTypeCodecRegistry.of(postQuotesQuoteAcceptRequestCodec)

  internal const val POSTQUOTESQUOTECANCEL_REQUEST_CODEC_ID: String =
      "PostQuotesQuoteCancel.request"

  private val postQuotesQuoteCancelRequestCodec:
      MediaTypeCodec<InlineV1QuotesCancelPostRequestFormX8d474b3c?> = PostQuotesQuoteCancelFormCodec

  private val postQuotesQuoteCancelResponseCodecAlternative0Codec: MediaTypeCodec<Quote> =
      KotlinxSerializationCodec("PostQuotesQuoteCancel.response.alternative0", Quote.Serializer, SdkJson)

  internal val postQuotesQuoteCancelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Quote>
      = MediaTypeCodecRegistry.of(postQuotesQuoteCancelResponseCodecAlternative0Codec)

  private val postQuotesQuoteCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostQuotesQuoteCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postQuotesQuoteCancelResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postQuotesQuoteCancelResponseCodecAlternative1Codec)

  internal val postQuotesQuoteCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1QuotesCancelPostRequestFormX8d474b3c?> =
      MediaTypeCodecRegistry.of(postQuotesQuoteCancelRequestCodec)

  internal const val POSTQUOTESQUOTEFINALIZE_REQUEST_CODEC_ID: String =
      "PostQuotesQuoteFinalize.request"

  private val postQuotesQuoteFinalizeRequestCodec:
      MediaTypeCodec<InlineV1QuotesFinalizePostRequestFormX0f68eddb?> =
      PostQuotesQuoteFinalizeFormCodec

  private val postQuotesQuoteFinalizeResponseCodecAlternative0Codec: MediaTypeCodec<Quote> =
      KotlinxSerializationCodec("PostQuotesQuoteFinalize.response.alternative0", Quote.Serializer, SdkJson)

  internal val postQuotesQuoteFinalizeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Quote> =
      MediaTypeCodecRegistry.of(postQuotesQuoteFinalizeResponseCodecAlternative0Codec)

  private val postQuotesQuoteFinalizeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostQuotesQuoteFinalize.response.alternative1", Error.Serializer, SdkJson)

  internal val postQuotesQuoteFinalizeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postQuotesQuoteFinalizeResponseCodecAlternative1Codec)

  internal val postQuotesQuoteFinalizeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1QuotesFinalizePostRequestFormX0f68eddb?> =
      MediaTypeCodecRegistry.of(postQuotesQuoteFinalizeRequestCodec)

  internal object GetQuotesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetQuotes.request"

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

  internal object GetQuotesQuoteFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetQuotesQuote.request"

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

  internal object GetQuotesQuoteComputedUpfrontLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetQuotesQuoteComputedUpfrontLineItems.request"

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

  internal object GetQuotesQuoteLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetQuotesQuoteLineItems.request"

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

  internal object GetQuotesQuotePdfFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetQuotesQuotePdf.request"

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

  internal object PostQuotesQuoteAcceptFormCodec : MediaTypeCodec<InlineV1QuotesAcceptPostRequestFormXaa798ec4?> {
    override val id: String = "PostQuotesQuoteAccept.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1QuotesAcceptPostRequestFormXaa798ec4?, mediaType: String): SdkRequestBody {
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1QuotesAcceptPostRequestFormXaa798ec4? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostQuotesQuoteCancelFormCodec : MediaTypeCodec<InlineV1QuotesCancelPostRequestFormX8d474b3c?> {
    override val id: String = "PostQuotesQuoteCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1QuotesCancelPostRequestFormX8d474b3c?, mediaType: String): SdkRequestBody {
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1QuotesCancelPostRequestFormX8d474b3c? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostQuotesQuoteFinalizeFormCodec : MediaTypeCodec<InlineV1QuotesFinalizePostRequestFormX0f68eddb?> {
    override val id: String = "PostQuotesQuoteFinalize.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1QuotesFinalizePostRequestFormX0f68eddb?, mediaType: String): SdkRequestBody {
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
      request.expiresAt?.let { formValue0 ->
        form.add("expires_at", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1QuotesFinalizePostRequestFormX0f68eddb? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'quotes' group of Stripe API.
 */
public class QuotesClient(
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
      SdkExecutor(transport, authentication = this@QuotesClient.authentication)

  /**
   * <p>Returns a list of your quotes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer The ID of the customer whose quotes you're retrieving.
   * @param customerAccount The ID of the account representing the customer whose quotes you're retrieving.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status The status of the quote.
   * @param testClock Provides a list of quotes that are associated with the specified test clock. The response will not
   * include quotes with test clocks if this and the customer parameter is not set.
   * @param options Execution options.
   */
  public suspend fun getQuotesWithResponse(
    request: JsonObject? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1QuotesGetParameterX941558cc? = null,
    testClock: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetQuotesResponse> = executor.executeWithResponse<JsonObject?, GetQuotesResponse>(SdkExecutionRequest(getQuotesMetadata, baseUri, request, listOf(QuotesCodecs.GETQUOTES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "test_clock", values = testClock?.let { listOf(it.toString()) }.orEmpty()))
  }), QuotesCodecs.getQuotesRequestCodecRegistry, GetQuotesResponseDecoder, options)

  /**
   * <p>Retrieves the quote with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getQuotesQuoteWithResponse(
    request: JsonObject? = null,
    quote: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetQuotesQuoteResponse> = executor.executeWithResponse<JsonObject?, GetQuotesQuoteResponse>(SdkExecutionRequest(getQuotesQuoteMetadata, baseUri, request, listOf(QuotesCodecs.GETQUOTESQUOTE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), QuotesCodecs.getQuotesQuoteRequestCodecRegistry, GetQuotesQuoteResponseDecoder, options)

  /**
   * <p>When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.
   * line_items</strong></a> property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
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
  public suspend fun getQuotesQuoteComputedUpfrontLineItemsWithResponse(
    request: JsonObject? = null,
    quote: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetQuotesQuoteComputedUpfrontLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetQuotesQuoteComputedUpfrontLineItemsResponse>(SdkExecutionRequest(getQuotesQuoteComputedUpfrontLineItemsMetadata, baseUri, request, listOf(QuotesCodecs.GETQUOTESQUOTECOMPUTEDUPFRONTLINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), QuotesCodecs.getQuotesQuoteComputedUpfrontLineItemsRequestCodecRegistry, GetQuotesQuoteComputedUpfrontLineItemsResponseDecoder, options)

  /**
   * <p>When retrieving a quote, there is an includable <strong>line_items</strong> property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
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
  public suspend fun getQuotesQuoteLineItemsWithResponse(
    request: JsonObject? = null,
    quote: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetQuotesQuoteLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetQuotesQuoteLineItemsResponse>(SdkExecutionRequest(getQuotesQuoteLineItemsMetadata, baseUri, request, listOf(QuotesCodecs.GETQUOTESQUOTELINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), QuotesCodecs.getQuotesQuoteLineItemsRequestCodecRegistry, GetQuotesQuoteLineItemsResponseDecoder, options)

  /**
   * <p>Download the PDF for a finalized quote. Explanation for special handling can be found <a
   * href="https://docs.stripe.com/quotes/overview#quote_pdf">here</a></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getQuotesQuotePdfWithResponse(
    request: JsonObject? = null,
    quote: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetQuotesQuotePdfResponse> = executor.executeWithResponse<JsonObject?, GetQuotesQuotePdfResponse>(SdkExecutionRequest(getQuotesQuotePdfMetadata, baseUri, request, listOf(QuotesCodecs.GETQUOTESQUOTEPDF_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), QuotesCodecs.getQuotesQuotePdfRequestCodecRegistry, GetQuotesQuotePdfResponseDecoder, options)

  /**
   * <p>Accepts the specified quote.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
   * @param options Execution options.
   */
  public suspend fun postQuotesQuoteAcceptWithResponse(
    request: InlineV1QuotesAcceptPostRequestFormXaa798ec4? = null,
    quote: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostQuotesQuoteAcceptResponse> = executor.executeWithResponse<InlineV1QuotesAcceptPostRequestFormXaa798ec4?, PostQuotesQuoteAcceptResponse>(SdkExecutionRequest(postQuotesQuoteAcceptMetadata, baseUri, request, listOf(QuotesCodecs.POSTQUOTESQUOTEACCEPT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
  }), QuotesCodecs.postQuotesQuoteAcceptRequestCodecRegistry, PostQuotesQuoteAcceptResponseDecoder, options)

  /**
   * <p>Cancels the quote.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
   * @param options Execution options.
   */
  public suspend fun postQuotesQuoteCancelWithResponse(
    request: InlineV1QuotesCancelPostRequestFormX8d474b3c? = null,
    quote: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostQuotesQuoteCancelResponse> = executor.executeWithResponse<InlineV1QuotesCancelPostRequestFormX8d474b3c?, PostQuotesQuoteCancelResponse>(SdkExecutionRequest(postQuotesQuoteCancelMetadata, baseUri, request, listOf(QuotesCodecs.POSTQUOTESQUOTECANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
  }), QuotesCodecs.postQuotesQuoteCancelRequestCodecRegistry, PostQuotesQuoteCancelResponseDecoder, options)

  /**
   * <p>Finalizes the quote.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param quote Wire parameter `quote`.
   * @param options Execution options.
   */
  public suspend fun postQuotesQuoteFinalizeWithResponse(
    request: InlineV1QuotesFinalizePostRequestFormX0f68eddb? = null,
    quote: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostQuotesQuoteFinalizeResponse> = executor.executeWithResponse<InlineV1QuotesFinalizePostRequestFormX0f68eddb?, PostQuotesQuoteFinalizeResponse>(SdkExecutionRequest(postQuotesQuoteFinalizeMetadata, baseUri, request, listOf(QuotesCodecs.POSTQUOTESQUOTEFINALIZE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "quote", values = listOf(quote.toString())))
  }), QuotesCodecs.postQuotesQuoteFinalizeRequestCodecRegistry, PostQuotesQuoteFinalizeResponseDecoder, options)

  /**
   * Typed response alternatives for `GetQuotes`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetQuotesResponse {
    public class SuccessJson(
      public val json: InlineV1QuotesGetResponse200JsonX586a0cec,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesResponse
  }

  private object GetQuotesResponseDecoder : SdkResponseAlternativeDecoder<GetQuotesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetQuotesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetQuotesResponse> = when {
      alternative.id == "GetQuotes.response.alternative0" -> SdkResponseDecodeResult(
        value = GetQuotesResponse.SuccessJson(
          json = QuotesCodecs.getQuotesResponseCodecAlternative0Registry.select(listOf("GetQuotes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetQuotes.response.alternative1" -> SdkResponseDecodeResult(
        value = GetQuotesResponse.DefaultJson(
          json = QuotesCodecs.getQuotesResponseCodecAlternative1Registry.select(listOf("GetQuotes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetQuotesResponse = GetQuotesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetQuotesQuote`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetQuotesQuoteResponse {
    public class SuccessJson(
      public val json: Quote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteResponse
  }

  private object GetQuotesQuoteResponseDecoder : SdkResponseAlternativeDecoder<GetQuotesQuoteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetQuotesQuoteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetQuotesQuoteResponse> = when {
      alternative.id == "GetQuotesQuote.response.alternative0" -> SdkResponseDecodeResult(
        value = GetQuotesQuoteResponse.SuccessJson(
          json = QuotesCodecs.getQuotesQuoteResponseCodecAlternative0Registry.select(listOf("GetQuotesQuote.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetQuotesQuote.response.alternative1" -> SdkResponseDecodeResult(
        value = GetQuotesQuoteResponse.DefaultJson(
          json = QuotesCodecs.getQuotesQuoteResponseCodecAlternative1Registry.select(listOf("GetQuotesQuote.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetQuotesQuoteResponse = GetQuotesQuoteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetQuotesQuoteComputedUpfrontLineItems`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetQuotesQuoteComputedUpfrontLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonX5c9b58d8,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteComputedUpfrontLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteComputedUpfrontLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteComputedUpfrontLineItemsResponse
  }

  private object GetQuotesQuoteComputedUpfrontLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetQuotesQuoteComputedUpfrontLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetQuotesQuoteComputedUpfrontLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetQuotesQuoteComputedUpfrontLineItemsResponse> = when {
      alternative.id == "GetQuotesQuoteComputedUpfrontLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetQuotesQuoteComputedUpfrontLineItemsResponse.SuccessJson(
          json = QuotesCodecs.getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative0Registry.select(listOf("GetQuotesQuoteComputedUpfrontLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetQuotesQuoteComputedUpfrontLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetQuotesQuoteComputedUpfrontLineItemsResponse.DefaultJson(
          json = QuotesCodecs.getQuotesQuoteComputedUpfrontLineItemsResponseCodecAlternative1Registry.select(listOf("GetQuotesQuoteComputedUpfrontLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetQuotesQuoteComputedUpfrontLineItemsResponse = GetQuotesQuoteComputedUpfrontLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetQuotesQuoteLineItems`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetQuotesQuoteLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1QuotesLineItemsGetResponse200JsonXf4a9fe37,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuoteLineItemsResponse
  }

  private object GetQuotesQuoteLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetQuotesQuoteLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetQuotesQuoteLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetQuotesQuoteLineItemsResponse> = when {
      alternative.id == "GetQuotesQuoteLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetQuotesQuoteLineItemsResponse.SuccessJson(
          json = QuotesCodecs.getQuotesQuoteLineItemsResponseCodecAlternative0Registry.select(listOf("GetQuotesQuoteLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetQuotesQuoteLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetQuotesQuoteLineItemsResponse.DefaultJson(
          json = QuotesCodecs.getQuotesQuoteLineItemsResponseCodecAlternative1Registry.select(listOf("GetQuotesQuoteLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetQuotesQuoteLineItemsResponse = GetQuotesQuoteLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetQuotesQuotePdf`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetQuotesQuotePdfResponse {
    public class SuccessPdf(
      public val bytes: SdkByteStream,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuotePdfResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuotePdfResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetQuotesQuotePdfResponse
  }

  private object GetQuotesQuotePdfResponseDecoder : SdkResponseAlternativeDecoder<GetQuotesQuotePdfResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetQuotesQuotePdfResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetQuotesQuotePdfResponse> = when {
      alternative.id == "GetQuotesQuotePdf.response.alternative0" -> SdkResponseDecodeResult(
        value = GetQuotesQuotePdfResponse.SuccessPdf(
          bytes = body,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = true,
      )
      alternative.id == "GetQuotesQuotePdf.response.alternative1" -> SdkResponseDecodeResult(
        value = GetQuotesQuotePdfResponse.DefaultJson(
          json = QuotesCodecs.getQuotesQuotePdfResponseCodecAlternative1Registry.select(listOf("GetQuotesQuotePdf.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetQuotesQuotePdfResponse = GetQuotesQuotePdfResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostQuotesQuoteAccept`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostQuotesQuoteAcceptResponse {
    public class SuccessJson(
      public val json: Quote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteAcceptResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteAcceptResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteAcceptResponse
  }

  private object PostQuotesQuoteAcceptResponseDecoder : SdkResponseAlternativeDecoder<PostQuotesQuoteAcceptResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostQuotesQuoteAcceptResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostQuotesQuoteAcceptResponse> = when {
      alternative.id == "PostQuotesQuoteAccept.response.alternative0" -> SdkResponseDecodeResult(
        value = PostQuotesQuoteAcceptResponse.SuccessJson(
          json = QuotesCodecs.postQuotesQuoteAcceptResponseCodecAlternative0Registry.select(listOf("PostQuotesQuoteAccept.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostQuotesQuoteAccept.response.alternative1" -> SdkResponseDecodeResult(
        value = PostQuotesQuoteAcceptResponse.DefaultJson(
          json = QuotesCodecs.postQuotesQuoteAcceptResponseCodecAlternative1Registry.select(listOf("PostQuotesQuoteAccept.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostQuotesQuoteAcceptResponse = PostQuotesQuoteAcceptResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostQuotesQuoteCancel`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostQuotesQuoteCancelResponse {
    public class SuccessJson(
      public val json: Quote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteCancelResponse
  }

  private object PostQuotesQuoteCancelResponseDecoder : SdkResponseAlternativeDecoder<PostQuotesQuoteCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostQuotesQuoteCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostQuotesQuoteCancelResponse> = when {
      alternative.id == "PostQuotesQuoteCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostQuotesQuoteCancelResponse.SuccessJson(
          json = QuotesCodecs.postQuotesQuoteCancelResponseCodecAlternative0Registry.select(listOf("PostQuotesQuoteCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostQuotesQuoteCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostQuotesQuoteCancelResponse.DefaultJson(
          json = QuotesCodecs.postQuotesQuoteCancelResponseCodecAlternative1Registry.select(listOf("PostQuotesQuoteCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostQuotesQuoteCancelResponse = PostQuotesQuoteCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostQuotesQuoteFinalize`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostQuotesQuoteFinalizeResponse {
    public class SuccessJson(
      public val json: Quote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteFinalizeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteFinalizeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostQuotesQuoteFinalizeResponse
  }

  private object PostQuotesQuoteFinalizeResponseDecoder : SdkResponseAlternativeDecoder<PostQuotesQuoteFinalizeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostQuotesQuoteFinalizeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostQuotesQuoteFinalizeResponse> = when {
      alternative.id == "PostQuotesQuoteFinalize.response.alternative0" -> SdkResponseDecodeResult(
        value = PostQuotesQuoteFinalizeResponse.SuccessJson(
          json = QuotesCodecs.postQuotesQuoteFinalizeResponseCodecAlternative0Registry.select(listOf("PostQuotesQuoteFinalize.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostQuotesQuoteFinalize.response.alternative1" -> SdkResponseDecodeResult(
        value = PostQuotesQuoteFinalizeResponse.DefaultJson(
          json = QuotesCodecs.postQuotesQuoteFinalizeResponseCodecAlternative1Registry.select(listOf("PostQuotesQuoteFinalize.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostQuotesQuoteFinalizeResponse = PostQuotesQuoteFinalizeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getQuotesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetQuotes",
          method = "GET",
          path = "/v1/quotes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1QuotesGetResponse200JsonX586a0cec",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotes.response.alternative1",
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

    internal val getQuotesQuoteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetQuotesQuote",
          method = "GET",
          path = "/v1/quotes/{quote}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Quote",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuote.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuote.response.alternative1",
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

    internal val getQuotesQuoteComputedUpfrontLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetQuotesQuoteComputedUpfrontLineItems",
          method = "GET",
          path = "/v1/quotes/{quote}/computed_upfront_line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonX5c9b58d8",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuoteComputedUpfrontLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuoteComputedUpfrontLineItems.response.alternative1",
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

    internal val getQuotesQuoteLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetQuotesQuoteLineItems",
          method = "GET",
          path = "/v1/quotes/{quote}/line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1QuotesLineItemsGetResponse200JsonXf4a9fe37",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuoteLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuoteLineItems.response.alternative1",
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

    internal val getQuotesQuotePdfMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetQuotesQuotePdf",
          method = "GET",
          path = "/v1/quotes/{quote}/pdf",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/pdf"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/pdf"),
              typeTag = "SdkByteStream",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuotePdf.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetQuotesQuotePdf.response.alternative1",
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

    internal val postQuotesQuoteAcceptMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostQuotesQuoteAccept",
          method = "POST",
          path = "/v1/quotes/{quote}/accept",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Quote",
              mode = SdkResponseMode.BUFFERED,
              id = "PostQuotesQuoteAccept.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostQuotesQuoteAccept.response.alternative1",
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

    internal val postQuotesQuoteCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostQuotesQuoteCancel",
          method = "POST",
          path = "/v1/quotes/{quote}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Quote",
              mode = SdkResponseMode.BUFFERED,
              id = "PostQuotesQuoteCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostQuotesQuoteCancel.response.alternative1",
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

    internal val postQuotesQuoteFinalizeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostQuotesQuoteFinalize",
          method = "POST",
          path = "/v1/quotes/{quote}/finalize",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Quote",
              mode = SdkResponseMode.BUFFERED,
              id = "PostQuotesQuoteFinalize.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostQuotesQuoteFinalize.response.alternative1",
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
