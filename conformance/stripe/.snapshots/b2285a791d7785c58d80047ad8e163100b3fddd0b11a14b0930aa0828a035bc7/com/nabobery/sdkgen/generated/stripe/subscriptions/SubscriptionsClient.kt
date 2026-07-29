package com.nabobery.sdkgen.generated.stripe.subscriptions

import com.nabobery.sdkgen.generated.stripe.DeletedDiscount
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterX0830f1ee
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterX55b9b695
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterX5c46aab3
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterXa8e001c1
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterXd8a29122
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterXf89e0230
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetResponse200JsonX03ae3f2d
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsMigratePostRequestFormX2629eab6
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsResumePostRequestFormX49dd835a
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsSearchGetResponse200JsonXd0c35d64
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.Subscription
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

public object SubscriptionsCodecs {
  public const val DELETESUBSCRIPTIONSSUBSCRIPTIONEXPOSEDIDDISCOUNT_REQUEST_CODEC_ID: String =
      "DeleteSubscriptionsSubscriptionExposedIdDiscount.request"

  private val deleteSubscriptionsSubscriptionExposedIdDiscountRequestCodec:
      MediaTypeCodec<JsonObject?> = DeleteSubscriptionsSubscriptionExposedIdDiscountFormCodec

  private val deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedDiscount> =
      KotlinxSerializationCodec("DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative0", DeletedDiscount.Serializer, SdkJson)

  public val deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedDiscount> =
      MediaTypeCodecRegistry.of(deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Codec)

  private val deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative1", Error.Serializer, SdkJson)

  public val deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Codec)

  public val deleteSubscriptionsSubscriptionExposedIdDiscountRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteSubscriptionsSubscriptionExposedIdDiscountRequestCodec)

  public const val GETSUBSCRIPTIONS_REQUEST_CODEC_ID: String = "GetSubscriptions.request"

  private val getSubscriptionsRequestCodec: MediaTypeCodec<JsonObject?> = GetSubscriptionsFormCodec

  private val getSubscriptionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SubscriptionsGetResponse200JsonX03ae3f2d> =
      KotlinxSerializationCodec("GetSubscriptions.response.alternative0", InlineV1SubscriptionsGetResponse200JsonX03ae3f2d.Serializer, SdkJson)

  public val getSubscriptionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SubscriptionsGetResponse200JsonX03ae3f2d> =
      MediaTypeCodecRegistry.of(getSubscriptionsResponseCodecAlternative0Codec)

  private val getSubscriptionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSubscriptions.response.alternative1", Error.Serializer, SdkJson)

  public val getSubscriptionsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSubscriptionsResponseCodecAlternative1Codec)

  public val getSubscriptionsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionsRequestCodec)

  public const val GETSUBSCRIPTIONSSEARCH_REQUEST_CODEC_ID: String =
      "GetSubscriptionsSearch.request"

  private val getSubscriptionsSearchRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSubscriptionsSearchFormCodec

  private val getSubscriptionsSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SubscriptionsSearchGetResponse200JsonXd0c35d64> =
      KotlinxSerializationCodec("GetSubscriptionsSearch.response.alternative0", InlineV1SubscriptionsSearchGetResponse200JsonXd0c35d64.Serializer, SdkJson)

  public val getSubscriptionsSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SubscriptionsSearchGetResponse200JsonXd0c35d64> =
      MediaTypeCodecRegistry.of(getSubscriptionsSearchResponseCodecAlternative0Codec)

  private val getSubscriptionsSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSubscriptionsSearch.response.alternative1", Error.Serializer, SdkJson)

  public val getSubscriptionsSearchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getSubscriptionsSearchResponseCodecAlternative1Codec)

  public val getSubscriptionsSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionsSearchRequestCodec)

  public const val GETSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDID_REQUEST_CODEC_ID: String =
      "GetSubscriptionsSubscriptionExposedId.request"

  private val getSubscriptionsSubscriptionExposedIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSubscriptionsSubscriptionExposedIdFormCodec

  private val getSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Codec:
      MediaTypeCodec<Subscription> =
      KotlinxSerializationCodec("GetSubscriptionsSubscriptionExposedId.response.alternative0", Subscription.Serializer, SdkJson)

  public val getSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Subscription> =
      MediaTypeCodecRegistry.of(getSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Codec)

  private val getSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSubscriptionsSubscriptionExposedId.response.alternative1", Error.Serializer, SdkJson)

  public val getSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Codec)

  public val getSubscriptionsSubscriptionExposedIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionsSubscriptionExposedIdRequestCodec)

  public const val POSTSUBSCRIPTIONSSUBSCRIPTIONMIGRATE_REQUEST_CODEC_ID: String =
      "PostSubscriptionsSubscriptionMigrate.request"

  private val postSubscriptionsSubscriptionMigrateRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionsMigratePostRequestFormX2629eab6> =
      PostSubscriptionsSubscriptionMigrateFormCodec

  private val postSubscriptionsSubscriptionMigrateResponseCodecAlternative0Codec:
      MediaTypeCodec<Subscription> =
      KotlinxSerializationCodec("PostSubscriptionsSubscriptionMigrate.response.alternative0", Subscription.Serializer, SdkJson)

  public val postSubscriptionsSubscriptionMigrateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Subscription> =
      MediaTypeCodecRegistry.of(postSubscriptionsSubscriptionMigrateResponseCodecAlternative0Codec)

  private val postSubscriptionsSubscriptionMigrateResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSubscriptionsSubscriptionMigrate.response.alternative1", Error.Serializer, SdkJson)

  public val postSubscriptionsSubscriptionMigrateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSubscriptionsSubscriptionMigrateResponseCodecAlternative1Codec)

  public val postSubscriptionsSubscriptionMigrateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionsMigratePostRequestFormX2629eab6> =
      MediaTypeCodecRegistry.of(postSubscriptionsSubscriptionMigrateRequestCodec)

  public const val POSTSUBSCRIPTIONSSUBSCRIPTIONRESUME_REQUEST_CODEC_ID: String =
      "PostSubscriptionsSubscriptionResume.request"

  private val postSubscriptionsSubscriptionResumeRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionsResumePostRequestFormX49dd835a?> =
      PostSubscriptionsSubscriptionResumeFormCodec

  private val postSubscriptionsSubscriptionResumeResponseCodecAlternative0Codec:
      MediaTypeCodec<Subscription> =
      KotlinxSerializationCodec("PostSubscriptionsSubscriptionResume.response.alternative0", Subscription.Serializer, SdkJson)

  public val postSubscriptionsSubscriptionResumeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Subscription> =
      MediaTypeCodecRegistry.of(postSubscriptionsSubscriptionResumeResponseCodecAlternative0Codec)

  private val postSubscriptionsSubscriptionResumeResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSubscriptionsSubscriptionResume.response.alternative1", Error.Serializer, SdkJson)

  public val postSubscriptionsSubscriptionResumeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSubscriptionsSubscriptionResumeResponseCodecAlternative1Codec)

  public val postSubscriptionsSubscriptionResumeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionsResumePostRequestFormX49dd835a?> =
      MediaTypeCodecRegistry.of(postSubscriptionsSubscriptionResumeRequestCodec)

  public object DeleteSubscriptionsSubscriptionExposedIdDiscountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteSubscriptionsSubscriptionExposedIdDiscount.request"

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

  public object GetSubscriptionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptions.request"

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

  public object GetSubscriptionsSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptionsSearch.request"

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

  public object GetSubscriptionsSubscriptionExposedIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptionsSubscriptionExposedId.request"

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

  public object PostSubscriptionsSubscriptionMigrateFormCodec : MediaTypeCodec<InlineV1SubscriptionsMigratePostRequestFormX2629eab6> {
    override val id: String = "PostSubscriptionsSubscriptionMigrate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionsMigratePostRequestFormX2629eab6, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.billingMode.flexible?.let { formValue1 ->
        formValue1.prorationDiscounts?.let { formValue3 ->
          form.add("billing_mode" + "[flexible]" + "[proration_discounts]", formValue3.value)
        }
      }
      form.add("billing_mode" + "[type]", request.billingMode.type.value)
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionsMigratePostRequestFormX2629eab6 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostSubscriptionsSubscriptionResumeFormCodec : MediaTypeCodec<InlineV1SubscriptionsResumePostRequestFormX49dd835a?> {
    override val id: String = "PostSubscriptionsSubscriptionResume.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionsResumePostRequestFormX49dd835a?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.billingCycleAnchor?.let { formValue0 ->
        form.add("billing_cycle_anchor", formValue0.value)
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
      request.prorationBehavior?.let { formValue0 ->
        form.add("proration_behavior", formValue0.value)
      }
      request.prorationDate?.let { formValue0 ->
        form.add("proration_date", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionsResumePostRequestFormX49dd835a? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'subscriptions' group of Stripe API.
 */
public class SubscriptionsClient(
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
      SdkExecutor(transport, authentication = this@SubscriptionsClient.authentication)

  /**
   * <p>Removes the currently applied discount on a subscription.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param subscriptionExposedId Wire parameter `subscription_exposed_id`.
   * @param options Execution options.
   */
  public suspend fun deleteSubscriptionsSubscriptionExposedIdDiscountWithResponse(
    request: JsonObject? = null,
    subscriptionExposedId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteSubscriptionsSubscriptionExposedIdDiscountResponse> = executor.executeWithResponse<JsonObject?, DeleteSubscriptionsSubscriptionExposedIdDiscountResponse>(SdkExecutionRequest(deleteSubscriptionsSubscriptionExposedIdDiscountMetadata, baseUri, request, listOf(SubscriptionsCodecs.DELETESUBSCRIPTIONSSUBSCRIPTIONEXPOSEDIDDISCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription_exposed_id", values = listOf(subscriptionExposedId.toString())))
  }), SubscriptionsCodecs.deleteSubscriptionsSubscriptionExposedIdDiscountRequestCodecRegistry, DeleteSubscriptionsSubscriptionExposedIdDiscountResponseDecoder, options)

  /**
   * <p>By default, returns a list of subscriptions that have not been canceled. In order to list canceled
   * subscriptions, specify <code>status=canceled</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param automaticTax Filter subscriptions by their automatic tax settings.
   * @param collectionMethod The collection method of the subscriptions to retrieve. Either `charge_automatically` or
   * `send_invoice`.
   * @param created Only return subscriptions that were created during the given date interval.
   * @param currentPeriodEnd Only return subscriptions whose minimum item current_period_end falls within the given date
   * interval.
   * @param currentPeriodStart Only return subscriptions whose maximum item current_period_start falls within the given
   * date interval.
   * @param customer The ID of the customer whose subscriptions you're retrieving.
   * @param customerAccount The ID of the account representing the customer whose subscriptions you're retrieving.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param price Filter for subscriptions that contain this recurring price ID.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status The status of the subscriptions to retrieve. Passing in a value of `canceled` will return all
   * canceled subscriptions, including those belonging to deleted customers. Pass `ended` to find subscriptions that are
   * canceled and subscriptions that are expired due to [incomplete
   * payment](https://docs.stripe.com/billing/subscriptions/overview#subscription-statuses). Passing in a value of `all`
   * will return subscriptions of all statuses. If no value is supplied, all subscriptions that have not been canceled
   * are returned.
   * @param testClock Filter for subscriptions that are associated with the specified test clock. The response will not
   * include subscriptions with test clocks if this and the customer parameter is not set.
   * @param options Execution options.
   */
  public suspend fun getSubscriptionsWithResponse(
    request: JsonObject? = null,
    automaticTax: InlineV1SubscriptionsGetParameterXf89e0230? = null,
    collectionMethod: InlineV1SubscriptionsGetParameterX5c46aab3? = null,
    created: InlineV1SubscriptionsGetParameterX55b9b695? = null,
    currentPeriodEnd: InlineV1SubscriptionsGetParameterXd8a29122? = null,
    currentPeriodStart: InlineV1SubscriptionsGetParameterXa8e001c1? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    price: String? = null,
    startingAfter: String? = null,
    status: InlineV1SubscriptionsGetParameterX0830f1ee? = null,
    testClock: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionsResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionsResponse>(SdkExecutionRequest(getSubscriptionsMetadata, baseUri, request, listOf(SubscriptionsCodecs.GETSUBSCRIPTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "automatic_tax[enabled]", values = automaticTax?.enabled?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "collection_method", values = collectionMethod?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "current_period_end", values = currentPeriodEnd?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "current_period_start", values = currentPeriodStart?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "price", values = price?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "test_clock", values = testClock?.let { listOf(it.toString()) }.orEmpty()))
  }), SubscriptionsCodecs.getSubscriptionsRequestCodecRegistry, GetSubscriptionsResponseDecoder, options)

  /**
   * <p>Search for subscriptions you’ve previously created using Stripe’s <a
   * href="/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param page A cursor for pagination across multiple pages of results. Don't include this parameter on the first
   * call. Use the next_page value returned in a previous response to request subsequent results.
   * @param query The search query string. See [search query
   * language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for
   * subscriptions](https://docs.stripe.com/search#query-fields-for-subscriptions).
   * @param options Execution options.
   */
  public suspend fun getSubscriptionsSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionsSearchResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionsSearchResponse>(SdkExecutionRequest(getSubscriptionsSearchMetadata, baseUri, request, listOf(SubscriptionsCodecs.GETSUBSCRIPTIONSSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), SubscriptionsCodecs.getSubscriptionsSearchRequestCodecRegistry, GetSubscriptionsSearchResponseDecoder, options)

  /**
   * <p>Retrieves the subscription with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param subscriptionExposedId Wire parameter `subscription_exposed_id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSubscriptionsSubscriptionExposedIdWithResponse(
    request: JsonObject? = null,
    subscriptionExposedId: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionsSubscriptionExposedIdResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionsSubscriptionExposedIdResponse>(SdkExecutionRequest(getSubscriptionsSubscriptionExposedIdMetadata, baseUri, request, listOf(SubscriptionsCodecs.GETSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription_exposed_id", values = listOf(subscriptionExposedId.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SubscriptionsCodecs.getSubscriptionsSubscriptionExposedIdRequestCodecRegistry, GetSubscriptionsSubscriptionExposedIdResponseDecoder, options)

  /**
   * <p>Upgrade the billing_mode of an existing subscription.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param subscription Wire parameter `subscription`.
   * @param options Execution options.
   */
  public suspend fun postSubscriptionsSubscriptionMigrateWithResponse(
    request: InlineV1SubscriptionsMigratePostRequestFormX2629eab6,
    subscription: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSubscriptionsSubscriptionMigrateResponse> = executor.executeWithResponse<InlineV1SubscriptionsMigratePostRequestFormX2629eab6, PostSubscriptionsSubscriptionMigrateResponse>(SdkExecutionRequest(postSubscriptionsSubscriptionMigrateMetadata, baseUri, request, listOf(SubscriptionsCodecs.POSTSUBSCRIPTIONSSUBSCRIPTIONMIGRATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription", values = listOf(subscription.toString())))
  }), SubscriptionsCodecs.postSubscriptionsSubscriptionMigrateRequestCodecRegistry, PostSubscriptionsSubscriptionMigrateResponseDecoder, options)

  /**
   * <p>Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor and creating
   * prorations. Resume is only available for subscriptions that use <code>charge_automatically</code> collection. If
   * Stripe doesn’t generate a resumption invoice, the subscription becomes <code>active</code> immediately. When a
   * resumption invoice is generated, Stripe finalizes it immediately. If the invoice is paid or marked uncollectible,
   * the subscription becomes <code>active</code>. If the invoice is manually voided, the subscription stays
   * <code>paused</code>. If there is no payment attempt within 23 hours, Stripe voids the invoice and the subscription
   * stays <code>paused</code>. Learn more about <a
   * href="/docs/billing/subscriptions/pause#resume-subscriptions">resuming subscriptions</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param subscription Wire parameter `subscription`.
   * @param options Execution options.
   */
  public suspend fun postSubscriptionsSubscriptionResumeWithResponse(
    request: InlineV1SubscriptionsResumePostRequestFormX49dd835a? = null,
    subscription: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSubscriptionsSubscriptionResumeResponse> = executor.executeWithResponse<InlineV1SubscriptionsResumePostRequestFormX49dd835a?, PostSubscriptionsSubscriptionResumeResponse>(SdkExecutionRequest(postSubscriptionsSubscriptionResumeMetadata, baseUri, request, listOf(SubscriptionsCodecs.POSTSUBSCRIPTIONSSUBSCRIPTIONRESUME_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription", values = listOf(subscription.toString())))
  }), SubscriptionsCodecs.postSubscriptionsSubscriptionResumeRequestCodecRegistry, PostSubscriptionsSubscriptionResumeResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteSubscriptionsSubscriptionExposedIdDiscount`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface DeleteSubscriptionsSubscriptionExposedIdDiscountResponse {
    public class SuccessJson(
      public val json: DeletedDiscount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteSubscriptionsSubscriptionExposedIdDiscountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteSubscriptionsSubscriptionExposedIdDiscountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteSubscriptionsSubscriptionExposedIdDiscountResponse
  }

  private object DeleteSubscriptionsSubscriptionExposedIdDiscountResponseDecoder : SdkResponseAlternativeDecoder<DeleteSubscriptionsSubscriptionExposedIdDiscountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteSubscriptionsSubscriptionExposedIdDiscountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteSubscriptionsSubscriptionExposedIdDiscountResponse> = when {
      alternative.id == "DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteSubscriptionsSubscriptionExposedIdDiscountResponse.SuccessJson(
          json = SubscriptionsCodecs.deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Registry.select(listOf("DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteSubscriptionsSubscriptionExposedIdDiscountResponse.DefaultJson(
          json = SubscriptionsCodecs.deleteSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Registry.select(listOf("DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteSubscriptionsSubscriptionExposedIdDiscountResponse = DeleteSubscriptionsSubscriptionExposedIdDiscountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSubscriptions`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetSubscriptionsResponse {
    public class SuccessJson(
      public val json: InlineV1SubscriptionsGetResponse200JsonX03ae3f2d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsResponse
  }

  private object GetSubscriptionsResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionsResponse> = when {
      alternative.id == "GetSubscriptions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionsResponse.SuccessJson(
          json = SubscriptionsCodecs.getSubscriptionsResponseCodecAlternative0Registry.select(listOf("GetSubscriptions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionsResponse.DefaultJson(
          json = SubscriptionsCodecs.getSubscriptionsResponseCodecAlternative1Registry.select(listOf("GetSubscriptions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionsResponse = GetSubscriptionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSubscriptionsSearch`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetSubscriptionsSearchResponse {
    public class SuccessJson(
      public val json: InlineV1SubscriptionsSearchGetResponse200JsonXd0c35d64,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsSearchResponse
  }

  private object GetSubscriptionsSearchResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionsSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionsSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionsSearchResponse> = when {
      alternative.id == "GetSubscriptionsSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionsSearchResponse.SuccessJson(
          json = SubscriptionsCodecs.getSubscriptionsSearchResponseCodecAlternative0Registry.select(listOf("GetSubscriptionsSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptionsSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionsSearchResponse.DefaultJson(
          json = SubscriptionsCodecs.getSubscriptionsSearchResponseCodecAlternative1Registry.select(listOf("GetSubscriptionsSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionsSearchResponse = GetSubscriptionsSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSubscriptionsSubscriptionExposedId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetSubscriptionsSubscriptionExposedIdResponse {
    public class SuccessJson(
      public val json: Subscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsSubscriptionExposedIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsSubscriptionExposedIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionsSubscriptionExposedIdResponse
  }

  private object GetSubscriptionsSubscriptionExposedIdResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionsSubscriptionExposedIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionsSubscriptionExposedIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionsSubscriptionExposedIdResponse> = when {
      alternative.id == "GetSubscriptionsSubscriptionExposedId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionsSubscriptionExposedIdResponse.SuccessJson(
          json = SubscriptionsCodecs.getSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Registry.select(listOf("GetSubscriptionsSubscriptionExposedId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptionsSubscriptionExposedId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionsSubscriptionExposedIdResponse.DefaultJson(
          json = SubscriptionsCodecs.getSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Registry.select(listOf("GetSubscriptionsSubscriptionExposedId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionsSubscriptionExposedIdResponse = GetSubscriptionsSubscriptionExposedIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSubscriptionsSubscriptionMigrate`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostSubscriptionsSubscriptionMigrateResponse {
    public class SuccessJson(
      public val json: Subscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionsSubscriptionMigrateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionsSubscriptionMigrateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionsSubscriptionMigrateResponse
  }

  private object PostSubscriptionsSubscriptionMigrateResponseDecoder : SdkResponseAlternativeDecoder<PostSubscriptionsSubscriptionMigrateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSubscriptionsSubscriptionMigrateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSubscriptionsSubscriptionMigrateResponse> = when {
      alternative.id == "PostSubscriptionsSubscriptionMigrate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSubscriptionsSubscriptionMigrateResponse.SuccessJson(
          json = SubscriptionsCodecs.postSubscriptionsSubscriptionMigrateResponseCodecAlternative0Registry.select(listOf("PostSubscriptionsSubscriptionMigrate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSubscriptionsSubscriptionMigrate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSubscriptionsSubscriptionMigrateResponse.DefaultJson(
          json = SubscriptionsCodecs.postSubscriptionsSubscriptionMigrateResponseCodecAlternative1Registry.select(listOf("PostSubscriptionsSubscriptionMigrate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSubscriptionsSubscriptionMigrateResponse = PostSubscriptionsSubscriptionMigrateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSubscriptionsSubscriptionResume`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostSubscriptionsSubscriptionResumeResponse {
    public class SuccessJson(
      public val json: Subscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionsSubscriptionResumeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionsSubscriptionResumeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionsSubscriptionResumeResponse
  }

  private object PostSubscriptionsSubscriptionResumeResponseDecoder : SdkResponseAlternativeDecoder<PostSubscriptionsSubscriptionResumeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSubscriptionsSubscriptionResumeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSubscriptionsSubscriptionResumeResponse> = when {
      alternative.id == "PostSubscriptionsSubscriptionResume.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSubscriptionsSubscriptionResumeResponse.SuccessJson(
          json = SubscriptionsCodecs.postSubscriptionsSubscriptionResumeResponseCodecAlternative0Registry.select(listOf("PostSubscriptionsSubscriptionResume.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSubscriptionsSubscriptionResume.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSubscriptionsSubscriptionResumeResponse.DefaultJson(
          json = SubscriptionsCodecs.postSubscriptionsSubscriptionResumeResponseCodecAlternative1Registry.select(listOf("PostSubscriptionsSubscriptionResume.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSubscriptionsSubscriptionResumeResponse = PostSubscriptionsSubscriptionResumeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteSubscriptionsSubscriptionExposedIdDiscountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteSubscriptionsSubscriptionExposedIdDiscount",
          method = "DELETE",
          path = "/v1/subscriptions/{subscription_exposed_id}/discount",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedDiscount",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteSubscriptionsSubscriptionExposedIdDiscount.response.alternative1",
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

    public val getSubscriptionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptions",
          method = "GET",
          path = "/v1/subscriptions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SubscriptionsGetResponse200JsonX03ae3f2d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptions.response.alternative1",
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

    public val getSubscriptionsSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptionsSearch",
          method = "GET",
          path = "/v1/subscriptions/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SubscriptionsSearchGetResponse200JsonXd0c35d64",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionsSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionsSearch.response.alternative1",
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

    public val getSubscriptionsSubscriptionExposedIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptionsSubscriptionExposedId",
          method = "GET",
          path = "/v1/subscriptions/{subscription_exposed_id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Subscription",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionsSubscriptionExposedId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionsSubscriptionExposedId.response.alternative1",
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

    public val postSubscriptionsSubscriptionMigrateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSubscriptionsSubscriptionMigrate",
          method = "POST",
          path = "/v1/subscriptions/{subscription}/migrate",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Subscription",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionsSubscriptionMigrate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionsSubscriptionMigrate.response.alternative1",
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

    public val postSubscriptionsSubscriptionResumeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSubscriptionsSubscriptionResume",
          method = "POST",
          path = "/v1/subscriptions/{subscription}/resume",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Subscription",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionsSubscriptionResume.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionsSubscriptionResume.response.alternative1",
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
