package com.nabobery.sdkgen.generated.stripe.payouts

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsCancelPostRequestFormXc7970a18
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsGetParameterX00f01c31
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsGetParameterX388d8ebc
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsGetResponse200JsonX91e28d3e
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsPostRequestFormXa9ffa118
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsPostRequestFormXcb083d28
import com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsReversePostRequestFormX3ef326e9
import com.nabobery.sdkgen.generated.stripe.Payout
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

internal object PayoutsCodecs {
  internal const val GETPAYOUTS_REQUEST_CODEC_ID: String = "GetPayouts.request"

  private val getPayoutsRequestCodec: MediaTypeCodec<JsonObject?> = GetPayoutsFormCodec

  private val getPayoutsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PayoutsGetResponse200JsonX91e28d3e> =
      KotlinxSerializationCodec("GetPayouts.response.alternative0", InlineV1PayoutsGetResponse200JsonX91e28d3e.Serializer, SdkJson)

  internal val getPayoutsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PayoutsGetResponse200JsonX91e28d3e> =
      MediaTypeCodecRegistry.of(getPayoutsResponseCodecAlternative0Codec)

  private val getPayoutsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPayouts.response.alternative1", Error.Serializer, SdkJson)

  internal val getPayoutsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPayoutsResponseCodecAlternative1Codec)

  internal val getPayoutsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPayoutsRequestCodec)

  internal const val GETPAYOUTSPAYOUT_REQUEST_CODEC_ID: String = "GetPayoutsPayout.request"

  private val getPayoutsPayoutRequestCodec: MediaTypeCodec<JsonObject?> = GetPayoutsPayoutFormCodec

  private val getPayoutsPayoutResponseCodecAlternative0Codec: MediaTypeCodec<Payout> =
      KotlinxSerializationCodec("GetPayoutsPayout.response.alternative0", Payout.Serializer, SdkJson)

  internal val getPayoutsPayoutResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Payout> =
      MediaTypeCodecRegistry.of(getPayoutsPayoutResponseCodecAlternative0Codec)

  private val getPayoutsPayoutResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPayoutsPayout.response.alternative1", Error.Serializer, SdkJson)

  internal val getPayoutsPayoutResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPayoutsPayoutResponseCodecAlternative1Codec)

  internal val getPayoutsPayoutRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPayoutsPayoutRequestCodec)

  internal const val POSTPAYOUTS_REQUEST_CODEC_ID: String = "PostPayouts.request"

  private val postPayoutsRequestCodec: MediaTypeCodec<InlineV1PayoutsPostRequestFormXa9ffa118> =
      PostPayoutsFormCodec

  private val postPayoutsResponseCodecAlternative0Codec: MediaTypeCodec<Payout> =
      KotlinxSerializationCodec("PostPayouts.response.alternative0", Payout.Serializer, SdkJson)

  internal val postPayoutsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Payout> =
      MediaTypeCodecRegistry.of(postPayoutsResponseCodecAlternative0Codec)

  private val postPayoutsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPayouts.response.alternative1", Error.Serializer, SdkJson)

  internal val postPayoutsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPayoutsResponseCodecAlternative1Codec)

  internal val postPayoutsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PayoutsPostRequestFormXa9ffa118> =
      MediaTypeCodecRegistry.of(postPayoutsRequestCodec)

  internal const val POSTPAYOUTSPAYOUT_REQUEST_CODEC_ID: String = "PostPayoutsPayout.request"

  private val postPayoutsPayoutRequestCodec:
      MediaTypeCodec<InlineV1PayoutsPostRequestFormXcb083d28?> = PostPayoutsPayoutFormCodec

  private val postPayoutsPayoutResponseCodecAlternative0Codec: MediaTypeCodec<Payout> =
      KotlinxSerializationCodec("PostPayoutsPayout.response.alternative0", Payout.Serializer, SdkJson)

  internal val postPayoutsPayoutResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Payout> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutResponseCodecAlternative0Codec)

  private val postPayoutsPayoutResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPayoutsPayout.response.alternative1", Error.Serializer, SdkJson)

  internal val postPayoutsPayoutResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutResponseCodecAlternative1Codec)

  internal val postPayoutsPayoutRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PayoutsPostRequestFormXcb083d28?> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutRequestCodec)

  internal const val POSTPAYOUTSPAYOUTCANCEL_REQUEST_CODEC_ID: String =
      "PostPayoutsPayoutCancel.request"

  private val postPayoutsPayoutCancelRequestCodec:
      MediaTypeCodec<InlineV1PayoutsCancelPostRequestFormXc7970a18?> =
      PostPayoutsPayoutCancelFormCodec

  private val postPayoutsPayoutCancelResponseCodecAlternative0Codec: MediaTypeCodec<Payout> =
      KotlinxSerializationCodec("PostPayoutsPayoutCancel.response.alternative0", Payout.Serializer, SdkJson)

  internal val postPayoutsPayoutCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Payout> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutCancelResponseCodecAlternative0Codec)

  private val postPayoutsPayoutCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPayoutsPayoutCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postPayoutsPayoutCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutCancelResponseCodecAlternative1Codec)

  internal val postPayoutsPayoutCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PayoutsCancelPostRequestFormXc7970a18?> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutCancelRequestCodec)

  internal const val POSTPAYOUTSPAYOUTREVERSE_REQUEST_CODEC_ID: String =
      "PostPayoutsPayoutReverse.request"

  private val postPayoutsPayoutReverseRequestCodec:
      MediaTypeCodec<InlineV1PayoutsReversePostRequestFormX3ef326e9?> =
      PostPayoutsPayoutReverseFormCodec

  private val postPayoutsPayoutReverseResponseCodecAlternative0Codec: MediaTypeCodec<Payout> =
      KotlinxSerializationCodec("PostPayoutsPayoutReverse.response.alternative0", Payout.Serializer, SdkJson)

  internal val postPayoutsPayoutReverseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Payout> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutReverseResponseCodecAlternative0Codec)

  private val postPayoutsPayoutReverseResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPayoutsPayoutReverse.response.alternative1", Error.Serializer, SdkJson)

  internal val postPayoutsPayoutReverseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutReverseResponseCodecAlternative1Codec)

  internal val postPayoutsPayoutReverseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PayoutsReversePostRequestFormX3ef326e9?> =
      MediaTypeCodecRegistry.of(postPayoutsPayoutReverseRequestCodec)

  internal object GetPayoutsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPayouts.request"

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

  internal object GetPayoutsPayoutFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPayoutsPayout.request"

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

  internal object PostPayoutsFormCodec : MediaTypeCodec<InlineV1PayoutsPostRequestFormXa9ffa118> {
    override val id: String = "PostPayouts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PayoutsPostRequestFormXa9ffa118, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("currency", request.currency)
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      request.destination?.let { formValue0 ->
        form.add("destination", formValue0)
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.method?.let { formValue0 ->
        form.add("method", formValue0.value)
      }
      request.payoutMethod?.let { formValue0 ->
        form.add("payout_method", formValue0)
      }
      request.sourceType?.let { formValue0 ->
        form.add("source_type", formValue0.value)
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PayoutsPostRequestFormXa9ffa118 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPayoutsPayoutFormCodec : MediaTypeCodec<InlineV1PayoutsPostRequestFormXcb083d28?> {
    override val id: String = "PostPayoutsPayout.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PayoutsPostRequestFormXcb083d28?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PayoutsPostRequestFormXcb083d28? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPayoutsPayoutCancelFormCodec : MediaTypeCodec<InlineV1PayoutsCancelPostRequestFormXc7970a18?> {
    override val id: String = "PostPayoutsPayoutCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PayoutsCancelPostRequestFormXc7970a18?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PayoutsCancelPostRequestFormXc7970a18? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPayoutsPayoutReverseFormCodec : MediaTypeCodec<InlineV1PayoutsReversePostRequestFormX3ef326e9?> {
    override val id: String = "PostPayoutsPayoutReverse.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PayoutsReversePostRequestFormX3ef326e9?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PayoutsReversePostRequestFormX3ef326e9? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payouts' group of Stripe API.
 */
public class PayoutsClient(
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
      SdkExecutor(transport, authentication = this@PayoutsClient.authentication)

  /**
   * <p>Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe sent to you. The
   * payouts return in sorted order, with the most recently created payouts appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param arrivalDate Only return payouts that are expected to arrive during the given date interval.
   * @param created Only return payouts that were created during the given date interval.
   * @param destination The ID of an external account - only return payouts sent to this external account.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return payouts that have the given status: `pending`, `paid`, `failed`, or `canceled`.
   * @param options Execution options.
   */
  public suspend fun getPayoutsWithResponse(
    request: JsonObject? = null,
    arrivalDate: InlineV1PayoutsGetParameterX00f01c31? = null,
    created: InlineV1PayoutsGetParameterX388d8ebc? = null,
    destination: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPayoutsResponse> = executor.executeWithResponse<JsonObject?, GetPayoutsResponse>(SdkExecutionRequest(getPayoutsMetadata, baseUri, request, listOf(PayoutsCodecs.GETPAYOUTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arrival_date", values = arrivalDate?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "destination", values = destination?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), PayoutsCodecs.getPayoutsRequestCodecRegistry, GetPayoutsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing payout. Supply the unique payout ID from either a payout creation request
   * or the payout list. Stripe returns the corresponding payout information.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param payout Wire parameter `payout`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPayoutsPayoutWithResponse(
    request: JsonObject? = null,
    payout: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPayoutsPayoutResponse> = executor.executeWithResponse<JsonObject?, GetPayoutsPayoutResponse>(SdkExecutionRequest(getPayoutsPayoutMetadata, baseUri, request, listOf(PayoutsCodecs.GETPAYOUTSPAYOUT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payout", values = listOf(payout.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PayoutsCodecs.getPayoutsPayoutRequestCodecRegistry, GetPayoutsPayoutResponseDecoder, options)

  /**
   * <p>To send funds to your own bank account, create a new payout object. Your <a href="#balance">Stripe balance</a>
   * must cover the payout amount. If it doesn’t, you receive an “Insufficient Funds” error.</p>
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action occurs as if you’re in
   * live mode.</p>
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types, you need to specify
   * the source type balance that the payout draws from. The <a href="/api/balances/object">balance object</a> details
   * available and pending amounts by source type.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPayoutsWithResponse(request: InlineV1PayoutsPostRequestFormXa9ffa118, options: CallOptions = CallOptions()): SdkResponseResult<PostPayoutsResponse> = executor.executeWithResponse<InlineV1PayoutsPostRequestFormXa9ffa118, PostPayoutsResponse>(SdkExecutionRequest(postPayoutsMetadata, baseUri, request, listOf(PayoutsCodecs.POSTPAYOUTS_REQUEST_CODEC_ID), emptyList()), PayoutsCodecs.postPayoutsRequestCodecRegistry, PostPayoutsResponseDecoder, options)

  /**
   * <p>Updates the specified payout by setting the values of the parameters you pass. We don’t change parameters that
   * you don’t provide. This request only accepts the metadata as arguments.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param payout Wire parameter `payout`.
   * @param options Execution options.
   */
  public suspend fun postPayoutsPayoutWithResponse(
    request: InlineV1PayoutsPostRequestFormXcb083d28? = null,
    payout: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPayoutsPayoutResponse> = executor.executeWithResponse<InlineV1PayoutsPostRequestFormXcb083d28?, PostPayoutsPayoutResponse>(SdkExecutionRequest(postPayoutsPayoutMetadata, baseUri, request, listOf(PayoutsCodecs.POSTPAYOUTSPAYOUT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payout", values = listOf(payout.toString())))
  }), PayoutsCodecs.postPayoutsPayoutRequestCodecRegistry, PostPayoutsPayoutResponseDecoder, options)

  /**
   * <p>You can cancel a previously created payout if its status is <code>pending</code>. Stripe refunds the funds to
   * your available balance. You can’t cancel automatic Stripe payouts.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param payout Wire parameter `payout`.
   * @param options Execution options.
   */
  public suspend fun postPayoutsPayoutCancelWithResponse(
    request: InlineV1PayoutsCancelPostRequestFormXc7970a18? = null,
    payout: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPayoutsPayoutCancelResponse> = executor.executeWithResponse<InlineV1PayoutsCancelPostRequestFormXc7970a18?, PostPayoutsPayoutCancelResponse>(SdkExecutionRequest(postPayoutsPayoutCancelMetadata, baseUri, request, listOf(PayoutsCodecs.POSTPAYOUTSPAYOUTCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payout", values = listOf(payout.toString())))
  }), PayoutsCodecs.postPayoutsPayoutCancelRequestCodecRegistry, PostPayoutsPayoutCancelResponseDecoder, options)

  /**
   * <p>Reverses a payout by debiting the destination bank account. At this time, you can only reverse payouts for
   * connected accounts to US and Canadian bank accounts. If the payout is manual and in the <code>pending</code>
   * status, use <code>/v1/payouts/:id/cancel</code> instead.</p>
   *
   * <p>By requesting a reversal through <code>/v1/payouts/:id/reverse</code>, you confirm that the authorized signatory
   * of the selected bank account authorizes the debit on the bank account and that no other authorization is
   * required.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param payout Wire parameter `payout`.
   * @param options Execution options.
   */
  public suspend fun postPayoutsPayoutReverseWithResponse(
    request: InlineV1PayoutsReversePostRequestFormX3ef326e9? = null,
    payout: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPayoutsPayoutReverseResponse> = executor.executeWithResponse<InlineV1PayoutsReversePostRequestFormX3ef326e9?, PostPayoutsPayoutReverseResponse>(SdkExecutionRequest(postPayoutsPayoutReverseMetadata, baseUri, request, listOf(PayoutsCodecs.POSTPAYOUTSPAYOUTREVERSE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payout", values = listOf(payout.toString())))
  }), PayoutsCodecs.postPayoutsPayoutReverseRequestCodecRegistry, PostPayoutsPayoutReverseResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPayouts`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPayoutsResponse {
    public class SuccessJson(
      public val json: InlineV1PayoutsGetResponse200JsonX91e28d3e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPayoutsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPayoutsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPayoutsResponse
  }

  private object GetPayoutsResponseDecoder : SdkResponseAlternativeDecoder<GetPayoutsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPayoutsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPayoutsResponse> = when {
      alternative.id == "GetPayouts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPayoutsResponse.SuccessJson(
          json = PayoutsCodecs.getPayoutsResponseCodecAlternative0Registry.select(listOf("GetPayouts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPayouts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPayoutsResponse.DefaultJson(
          json = PayoutsCodecs.getPayoutsResponseCodecAlternative1Registry.select(listOf("GetPayouts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPayoutsResponse = GetPayoutsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPayoutsPayout`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPayoutsPayoutResponse {
    public class SuccessJson(
      public val json: Payout,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPayoutsPayoutResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPayoutsPayoutResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPayoutsPayoutResponse
  }

  private object GetPayoutsPayoutResponseDecoder : SdkResponseAlternativeDecoder<GetPayoutsPayoutResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPayoutsPayoutResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPayoutsPayoutResponse> = when {
      alternative.id == "GetPayoutsPayout.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPayoutsPayoutResponse.SuccessJson(
          json = PayoutsCodecs.getPayoutsPayoutResponseCodecAlternative0Registry.select(listOf("GetPayoutsPayout.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPayoutsPayout.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPayoutsPayoutResponse.DefaultJson(
          json = PayoutsCodecs.getPayoutsPayoutResponseCodecAlternative1Registry.select(listOf("GetPayoutsPayout.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPayoutsPayoutResponse = GetPayoutsPayoutResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPayouts`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostPayoutsResponse {
    public class SuccessJson(
      public val json: Payout,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsResponse
  }

  private object PostPayoutsResponseDecoder : SdkResponseAlternativeDecoder<PostPayoutsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPayoutsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPayoutsResponse> = when {
      alternative.id == "PostPayouts.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPayoutsResponse.SuccessJson(
          json = PayoutsCodecs.postPayoutsResponseCodecAlternative0Registry.select(listOf("PostPayouts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPayouts.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPayoutsResponse.DefaultJson(
          json = PayoutsCodecs.postPayoutsResponseCodecAlternative1Registry.select(listOf("PostPayouts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPayoutsResponse = PostPayoutsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPayoutsPayout`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostPayoutsPayoutResponse {
    public class SuccessJson(
      public val json: Payout,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutResponse
  }

  private object PostPayoutsPayoutResponseDecoder : SdkResponseAlternativeDecoder<PostPayoutsPayoutResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPayoutsPayoutResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPayoutsPayoutResponse> = when {
      alternative.id == "PostPayoutsPayout.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPayoutsPayoutResponse.SuccessJson(
          json = PayoutsCodecs.postPayoutsPayoutResponseCodecAlternative0Registry.select(listOf("PostPayoutsPayout.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPayoutsPayout.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPayoutsPayoutResponse.DefaultJson(
          json = PayoutsCodecs.postPayoutsPayoutResponseCodecAlternative1Registry.select(listOf("PostPayoutsPayout.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPayoutsPayoutResponse = PostPayoutsPayoutResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPayoutsPayoutCancel`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostPayoutsPayoutCancelResponse {
    public class SuccessJson(
      public val json: Payout,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutCancelResponse
  }

  private object PostPayoutsPayoutCancelResponseDecoder : SdkResponseAlternativeDecoder<PostPayoutsPayoutCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPayoutsPayoutCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPayoutsPayoutCancelResponse> = when {
      alternative.id == "PostPayoutsPayoutCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPayoutsPayoutCancelResponse.SuccessJson(
          json = PayoutsCodecs.postPayoutsPayoutCancelResponseCodecAlternative0Registry.select(listOf("PostPayoutsPayoutCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPayoutsPayoutCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPayoutsPayoutCancelResponse.DefaultJson(
          json = PayoutsCodecs.postPayoutsPayoutCancelResponseCodecAlternative1Registry.select(listOf("PostPayoutsPayoutCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPayoutsPayoutCancelResponse = PostPayoutsPayoutCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPayoutsPayoutReverse`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostPayoutsPayoutReverseResponse {
    public class SuccessJson(
      public val json: Payout,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutReverseResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutReverseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPayoutsPayoutReverseResponse
  }

  private object PostPayoutsPayoutReverseResponseDecoder : SdkResponseAlternativeDecoder<PostPayoutsPayoutReverseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPayoutsPayoutReverseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPayoutsPayoutReverseResponse> = when {
      alternative.id == "PostPayoutsPayoutReverse.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPayoutsPayoutReverseResponse.SuccessJson(
          json = PayoutsCodecs.postPayoutsPayoutReverseResponseCodecAlternative0Registry.select(listOf("PostPayoutsPayoutReverse.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPayoutsPayoutReverse.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPayoutsPayoutReverseResponse.DefaultJson(
          json = PayoutsCodecs.postPayoutsPayoutReverseResponseCodecAlternative1Registry.select(listOf("PostPayoutsPayoutReverse.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPayoutsPayoutReverseResponse = PostPayoutsPayoutReverseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPayoutsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPayouts",
          method = "GET",
          path = "/v1/payouts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PayoutsGetResponse200JsonX91e28d3e",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPayouts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPayouts.response.alternative1",
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

    internal val getPayoutsPayoutMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPayoutsPayout",
          method = "GET",
          path = "/v1/payouts/{payout}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Payout",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPayoutsPayout.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPayoutsPayout.response.alternative1",
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

    internal val postPayoutsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPayouts",
          method = "POST",
          path = "/v1/payouts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Payout",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayouts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayouts.response.alternative1",
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

    internal val postPayoutsPayoutMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPayoutsPayout",
          method = "POST",
          path = "/v1/payouts/{payout}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Payout",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayoutsPayout.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayoutsPayout.response.alternative1",
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

    internal val postPayoutsPayoutCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPayoutsPayoutCancel",
          method = "POST",
          path = "/v1/payouts/{payout}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Payout",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayoutsPayoutCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayoutsPayoutCancel.response.alternative1",
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

    internal val postPayoutsPayoutReverseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPayoutsPayoutReverse",
          method = "POST",
          path = "/v1/payouts/{payout}/reverse",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Payout",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayoutsPayoutReverse.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPayoutsPayoutReverse.response.alternative1",
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
