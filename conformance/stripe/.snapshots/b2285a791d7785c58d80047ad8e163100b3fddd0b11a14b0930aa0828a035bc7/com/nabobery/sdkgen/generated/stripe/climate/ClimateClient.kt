package com.nabobery.sdkgen.generated.stripe.climate

import com.nabobery.sdkgen.generated.stripe.ClimateOrder
import com.nabobery.sdkgen.generated.stripe.ClimateProduct
import com.nabobery.sdkgen.generated.stripe.ClimateSupplier
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1ClimateOrdersCancelPostRequestFormX5341f90c
import com.nabobery.sdkgen.generated.stripe.InlineV1ClimateOrdersGetResponse200JsonX912e8c78
import com.nabobery.sdkgen.generated.stripe.InlineV1ClimateOrdersPostRequestFormX119d6614
import com.nabobery.sdkgen.generated.stripe.InlineV1ClimateProductsGetResponse200JsonXe42cab65
import com.nabobery.sdkgen.generated.stripe.InlineV1ClimateSuppliersGetResponse200JsonXa7895ef5
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

public object ClimateCodecs {
  public const val GETCLIMATEORDERS_REQUEST_CODEC_ID: String = "GetClimateOrders.request"

  private val getClimateOrdersRequestCodec: MediaTypeCodec<JsonObject?> = GetClimateOrdersFormCodec

  private val getClimateOrdersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ClimateOrdersGetResponse200JsonX912e8c78> =
      KotlinxSerializationCodec("GetClimateOrders.response.alternative0", InlineV1ClimateOrdersGetResponse200JsonX912e8c78.Serializer, SdkJson)

  public val getClimateOrdersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ClimateOrdersGetResponse200JsonX912e8c78> =
      MediaTypeCodecRegistry.of(getClimateOrdersResponseCodecAlternative0Codec)

  private val getClimateOrdersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetClimateOrders.response.alternative1", Error.Serializer, SdkJson)

  public val getClimateOrdersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getClimateOrdersResponseCodecAlternative1Codec)

  public val getClimateOrdersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getClimateOrdersRequestCodec)

  public const val GETCLIMATEORDERSORDER_REQUEST_CODEC_ID: String = "GetClimateOrdersOrder.request"

  private val getClimateOrdersOrderRequestCodec: MediaTypeCodec<JsonObject?> =
      GetClimateOrdersOrderFormCodec

  private val getClimateOrdersOrderResponseCodecAlternative0Codec: MediaTypeCodec<ClimateOrder> =
      KotlinxSerializationCodec("GetClimateOrdersOrder.response.alternative0", ClimateOrder.Serializer, SdkJson)

  public val getClimateOrdersOrderResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ClimateOrder> =
      MediaTypeCodecRegistry.of(getClimateOrdersOrderResponseCodecAlternative0Codec)

  private val getClimateOrdersOrderResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetClimateOrdersOrder.response.alternative1", Error.Serializer, SdkJson)

  public val getClimateOrdersOrderResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getClimateOrdersOrderResponseCodecAlternative1Codec)

  public val getClimateOrdersOrderRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getClimateOrdersOrderRequestCodec)

  public const val GETCLIMATEPRODUCTS_REQUEST_CODEC_ID: String = "GetClimateProducts.request"

  private val getClimateProductsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetClimateProductsFormCodec

  private val getClimateProductsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ClimateProductsGetResponse200JsonXe42cab65> =
      KotlinxSerializationCodec("GetClimateProducts.response.alternative0", InlineV1ClimateProductsGetResponse200JsonXe42cab65.Serializer, SdkJson)

  public val getClimateProductsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ClimateProductsGetResponse200JsonXe42cab65> =
      MediaTypeCodecRegistry.of(getClimateProductsResponseCodecAlternative0Codec)

  private val getClimateProductsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetClimateProducts.response.alternative1", Error.Serializer, SdkJson)

  public val getClimateProductsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getClimateProductsResponseCodecAlternative1Codec)

  public val getClimateProductsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getClimateProductsRequestCodec)

  public const val GETCLIMATEPRODUCTSPRODUCT_REQUEST_CODEC_ID: String =
      "GetClimateProductsProduct.request"

  private val getClimateProductsProductRequestCodec: MediaTypeCodec<JsonObject?> =
      GetClimateProductsProductFormCodec

  private val getClimateProductsProductResponseCodecAlternative0Codec:
      MediaTypeCodec<ClimateProduct> =
      KotlinxSerializationCodec("GetClimateProductsProduct.response.alternative0", ClimateProduct.Serializer, SdkJson)

  public val getClimateProductsProductResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ClimateProduct> =
      MediaTypeCodecRegistry.of(getClimateProductsProductResponseCodecAlternative0Codec)

  private val getClimateProductsProductResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetClimateProductsProduct.response.alternative1", Error.Serializer, SdkJson)

  public val getClimateProductsProductResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getClimateProductsProductResponseCodecAlternative1Codec)

  public val getClimateProductsProductRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getClimateProductsProductRequestCodec)

  public const val GETCLIMATESUPPLIERS_REQUEST_CODEC_ID: String = "GetClimateSuppliers.request"

  private val getClimateSuppliersRequestCodec: MediaTypeCodec<JsonObject?> =
      GetClimateSuppliersFormCodec

  private val getClimateSuppliersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ClimateSuppliersGetResponse200JsonXa7895ef5> =
      KotlinxSerializationCodec("GetClimateSuppliers.response.alternative0", InlineV1ClimateSuppliersGetResponse200JsonXa7895ef5.Serializer, SdkJson)

  public val getClimateSuppliersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ClimateSuppliersGetResponse200JsonXa7895ef5> =
      MediaTypeCodecRegistry.of(getClimateSuppliersResponseCodecAlternative0Codec)

  private val getClimateSuppliersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetClimateSuppliers.response.alternative1", Error.Serializer, SdkJson)

  public val getClimateSuppliersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getClimateSuppliersResponseCodecAlternative1Codec)

  public val getClimateSuppliersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getClimateSuppliersRequestCodec)

  public const val GETCLIMATESUPPLIERSSUPPLIER_REQUEST_CODEC_ID: String =
      "GetClimateSuppliersSupplier.request"

  private val getClimateSuppliersSupplierRequestCodec: MediaTypeCodec<JsonObject?> =
      GetClimateSuppliersSupplierFormCodec

  private val getClimateSuppliersSupplierResponseCodecAlternative0Codec:
      MediaTypeCodec<ClimateSupplier> =
      KotlinxSerializationCodec("GetClimateSuppliersSupplier.response.alternative0", ClimateSupplier.Serializer, SdkJson)

  public val getClimateSuppliersSupplierResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ClimateSupplier> =
      MediaTypeCodecRegistry.of(getClimateSuppliersSupplierResponseCodecAlternative0Codec)

  private val getClimateSuppliersSupplierResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetClimateSuppliersSupplier.response.alternative1", Error.Serializer, SdkJson)

  public val getClimateSuppliersSupplierResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getClimateSuppliersSupplierResponseCodecAlternative1Codec)

  public val getClimateSuppliersSupplierRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getClimateSuppliersSupplierRequestCodec)

  public const val POSTCLIMATEORDERS_REQUEST_CODEC_ID: String = "PostClimateOrders.request"

  private val postClimateOrdersRequestCodec:
      MediaTypeCodec<InlineV1ClimateOrdersPostRequestFormX119d6614> = PostClimateOrdersFormCodec

  private val postClimateOrdersResponseCodecAlternative0Codec: MediaTypeCodec<ClimateOrder> =
      KotlinxSerializationCodec("PostClimateOrders.response.alternative0", ClimateOrder.Serializer, SdkJson)

  public val postClimateOrdersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ClimateOrder> =
      MediaTypeCodecRegistry.of(postClimateOrdersResponseCodecAlternative0Codec)

  private val postClimateOrdersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostClimateOrders.response.alternative1", Error.Serializer, SdkJson)

  public val postClimateOrdersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postClimateOrdersResponseCodecAlternative1Codec)

  public val postClimateOrdersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ClimateOrdersPostRequestFormX119d6614> =
      MediaTypeCodecRegistry.of(postClimateOrdersRequestCodec)

  public const val POSTCLIMATEORDERSORDERCANCEL_REQUEST_CODEC_ID: String =
      "PostClimateOrdersOrderCancel.request"

  private val postClimateOrdersOrderCancelRequestCodec:
      MediaTypeCodec<InlineV1ClimateOrdersCancelPostRequestFormX5341f90c?> =
      PostClimateOrdersOrderCancelFormCodec

  private val postClimateOrdersOrderCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<ClimateOrder> =
      KotlinxSerializationCodec("PostClimateOrdersOrderCancel.response.alternative0", ClimateOrder.Serializer, SdkJson)

  public val postClimateOrdersOrderCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ClimateOrder> =
      MediaTypeCodecRegistry.of(postClimateOrdersOrderCancelResponseCodecAlternative0Codec)

  private val postClimateOrdersOrderCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostClimateOrdersOrderCancel.response.alternative1", Error.Serializer, SdkJson)

  public val postClimateOrdersOrderCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postClimateOrdersOrderCancelResponseCodecAlternative1Codec)

  public val postClimateOrdersOrderCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ClimateOrdersCancelPostRequestFormX5341f90c?> =
      MediaTypeCodecRegistry.of(postClimateOrdersOrderCancelRequestCodec)

  public object GetClimateOrdersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetClimateOrders.request"

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

  public object GetClimateOrdersOrderFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetClimateOrdersOrder.request"

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

  public object GetClimateProductsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetClimateProducts.request"

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

  public object GetClimateProductsProductFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetClimateProductsProduct.request"

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

  public object GetClimateSuppliersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetClimateSuppliers.request"

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

  public object GetClimateSuppliersSupplierFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetClimateSuppliersSupplier.request"

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

  public object PostClimateOrdersFormCodec : MediaTypeCodec<InlineV1ClimateOrdersPostRequestFormX119d6614> {
    override val id: String = "PostClimateOrders.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ClimateOrdersPostRequestFormX119d6614, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.beneficiary?.let { formValue0 ->
        form.add("beneficiary" + "[public_name]", formValue0.publicName)
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
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
      request.metricTons?.let { formValue0 ->
        form.add("metric_tons", formValue0)
      }
      form.add("product", request.product)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ClimateOrdersPostRequestFormX119d6614 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostClimateOrdersOrderCancelFormCodec : MediaTypeCodec<InlineV1ClimateOrdersCancelPostRequestFormX5341f90c?> {
    override val id: String = "PostClimateOrdersOrderCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ClimateOrdersCancelPostRequestFormX5341f90c?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ClimateOrdersCancelPostRequestFormX5341f90c? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'climate' group of Stripe API.
 */
public class ClimateClient(
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
      SdkExecutor(transport, authentication = this@ClimateClient.authentication)

  /**
   * <p>Lists all Climate order objects. The orders are returned sorted by creation date, with the
   * most recently created orders appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
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
  public suspend fun getClimateOrdersWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetClimateOrdersResponse> = executor.executeWithResponse<JsonObject?, GetClimateOrdersResponse>(SdkExecutionRequest(getClimateOrdersMetadata, baseUri, request, listOf(ClimateCodecs.GETCLIMATEORDERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ClimateCodecs.getClimateOrdersRequestCodecRegistry, GetClimateOrdersResponseDecoder, options)

  /**
   * <p>Retrieves the details of a Climate order object with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param order Unique identifier of the order.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getClimateOrdersOrderWithResponse(
    request: JsonObject? = null,
    order: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetClimateOrdersOrderResponse> = executor.executeWithResponse<JsonObject?, GetClimateOrdersOrderResponse>(SdkExecutionRequest(getClimateOrdersOrderMetadata, baseUri, request, listOf(ClimateCodecs.GETCLIMATEORDERSORDER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "order", values = listOf(order.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ClimateCodecs.getClimateOrdersOrderRequestCodecRegistry, GetClimateOrdersOrderResponseDecoder, options)

  /**
   * <p>Lists all available Climate product objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
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
  public suspend fun getClimateProductsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetClimateProductsResponse> = executor.executeWithResponse<JsonObject?, GetClimateProductsResponse>(SdkExecutionRequest(getClimateProductsMetadata, baseUri, request, listOf(ClimateCodecs.GETCLIMATEPRODUCTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ClimateCodecs.getClimateProductsRequestCodecRegistry, GetClimateProductsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a Climate product with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param product Wire parameter `product`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getClimateProductsProductWithResponse(
    request: JsonObject? = null,
    product: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetClimateProductsProductResponse> = executor.executeWithResponse<JsonObject?, GetClimateProductsProductResponse>(SdkExecutionRequest(getClimateProductsProductMetadata, baseUri, request, listOf(ClimateCodecs.GETCLIMATEPRODUCTSPRODUCT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "product", values = listOf(product.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ClimateCodecs.getClimateProductsProductRequestCodecRegistry, GetClimateProductsProductResponseDecoder, options)

  /**
   * <p>Lists all available Climate supplier objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
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
  public suspend fun getClimateSuppliersWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetClimateSuppliersResponse> = executor.executeWithResponse<JsonObject?, GetClimateSuppliersResponse>(SdkExecutionRequest(getClimateSuppliersMetadata, baseUri, request, listOf(ClimateCodecs.GETCLIMATESUPPLIERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ClimateCodecs.getClimateSuppliersRequestCodecRegistry, GetClimateSuppliersResponseDecoder, options)

  /**
   * <p>Retrieves a Climate supplier object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param supplier Wire parameter `supplier`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getClimateSuppliersSupplierWithResponse(
    request: JsonObject? = null,
    supplier: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetClimateSuppliersSupplierResponse> = executor.executeWithResponse<JsonObject?, GetClimateSuppliersSupplierResponse>(SdkExecutionRequest(getClimateSuppliersSupplierMetadata, baseUri, request, listOf(ClimateCodecs.GETCLIMATESUPPLIERSSUPPLIER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "supplier", values = listOf(supplier.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ClimateCodecs.getClimateSuppliersSupplierRequestCodecRegistry, GetClimateSuppliersSupplierResponseDecoder, options)

  /**
   * <p>Creates a Climate order object for a given Climate product. The order will be processed immediately
   * after creation and payment will be deducted your Stripe balance.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postClimateOrdersWithResponse(request: InlineV1ClimateOrdersPostRequestFormX119d6614, options: CallOptions = CallOptions()): SdkResponseResult<PostClimateOrdersResponse> = executor.executeWithResponse<InlineV1ClimateOrdersPostRequestFormX119d6614, PostClimateOrdersResponse>(SdkExecutionRequest(postClimateOrdersMetadata, baseUri, request, listOf(ClimateCodecs.POSTCLIMATEORDERS_REQUEST_CODEC_ID), emptyList()), ClimateCodecs.postClimateOrdersRequestCodecRegistry, PostClimateOrdersResponseDecoder, options)

  /**
   * <p>Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds the
   * reservation <code>amount_subtotal</code>, but not the <code>amount_fees</code> for user-triggered cancellations.
   * Frontier
   * might cancel reservations if suppliers fail to deliver. If Frontier cancels the reservation, Stripe
   * provides 90 days advance notice and refunds the <code>amount_total</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param order Unique identifier of the order.
   * @param options Execution options.
   */
  public suspend fun postClimateOrdersOrderCancelWithResponse(
    request: InlineV1ClimateOrdersCancelPostRequestFormX5341f90c? = null,
    order: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostClimateOrdersOrderCancelResponse> = executor.executeWithResponse<InlineV1ClimateOrdersCancelPostRequestFormX5341f90c?, PostClimateOrdersOrderCancelResponse>(SdkExecutionRequest(postClimateOrdersOrderCancelMetadata, baseUri, request, listOf(ClimateCodecs.POSTCLIMATEORDERSORDERCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "order", values = listOf(order.toString())))
  }), ClimateCodecs.postClimateOrdersOrderCancelRequestCodecRegistry, PostClimateOrdersOrderCancelResponseDecoder, options)

  /**
   * Typed response alternatives for `GetClimateOrders`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetClimateOrdersResponse {
    public class SuccessJson(
      public val json: InlineV1ClimateOrdersGetResponse200JsonX912e8c78,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateOrdersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateOrdersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateOrdersResponse
  }

  private object GetClimateOrdersResponseDecoder : SdkResponseAlternativeDecoder<GetClimateOrdersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetClimateOrdersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetClimateOrdersResponse> = when {
      alternative.id == "GetClimateOrders.response.alternative0" -> SdkResponseDecodeResult(
        value = GetClimateOrdersResponse.SuccessJson(
          json = ClimateCodecs.getClimateOrdersResponseCodecAlternative0Registry.select(listOf("GetClimateOrders.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetClimateOrders.response.alternative1" -> SdkResponseDecodeResult(
        value = GetClimateOrdersResponse.DefaultJson(
          json = ClimateCodecs.getClimateOrdersResponseCodecAlternative1Registry.select(listOf("GetClimateOrders.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetClimateOrdersResponse = GetClimateOrdersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetClimateOrdersOrder`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetClimateOrdersOrderResponse {
    public class SuccessJson(
      public val json: ClimateOrder,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateOrdersOrderResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateOrdersOrderResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateOrdersOrderResponse
  }

  private object GetClimateOrdersOrderResponseDecoder : SdkResponseAlternativeDecoder<GetClimateOrdersOrderResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetClimateOrdersOrderResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetClimateOrdersOrderResponse> = when {
      alternative.id == "GetClimateOrdersOrder.response.alternative0" -> SdkResponseDecodeResult(
        value = GetClimateOrdersOrderResponse.SuccessJson(
          json = ClimateCodecs.getClimateOrdersOrderResponseCodecAlternative0Registry.select(listOf("GetClimateOrdersOrder.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetClimateOrdersOrder.response.alternative1" -> SdkResponseDecodeResult(
        value = GetClimateOrdersOrderResponse.DefaultJson(
          json = ClimateCodecs.getClimateOrdersOrderResponseCodecAlternative1Registry.select(listOf("GetClimateOrdersOrder.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetClimateOrdersOrderResponse = GetClimateOrdersOrderResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetClimateProducts`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetClimateProductsResponse {
    public class SuccessJson(
      public val json: InlineV1ClimateProductsGetResponse200JsonXe42cab65,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateProductsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateProductsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateProductsResponse
  }

  private object GetClimateProductsResponseDecoder : SdkResponseAlternativeDecoder<GetClimateProductsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetClimateProductsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetClimateProductsResponse> = when {
      alternative.id == "GetClimateProducts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetClimateProductsResponse.SuccessJson(
          json = ClimateCodecs.getClimateProductsResponseCodecAlternative0Registry.select(listOf("GetClimateProducts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetClimateProducts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetClimateProductsResponse.DefaultJson(
          json = ClimateCodecs.getClimateProductsResponseCodecAlternative1Registry.select(listOf("GetClimateProducts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetClimateProductsResponse = GetClimateProductsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetClimateProductsProduct`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetClimateProductsProductResponse {
    public class SuccessJson(
      public val json: ClimateProduct,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateProductsProductResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateProductsProductResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateProductsProductResponse
  }

  private object GetClimateProductsProductResponseDecoder : SdkResponseAlternativeDecoder<GetClimateProductsProductResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetClimateProductsProductResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetClimateProductsProductResponse> = when {
      alternative.id == "GetClimateProductsProduct.response.alternative0" -> SdkResponseDecodeResult(
        value = GetClimateProductsProductResponse.SuccessJson(
          json = ClimateCodecs.getClimateProductsProductResponseCodecAlternative0Registry.select(listOf("GetClimateProductsProduct.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetClimateProductsProduct.response.alternative1" -> SdkResponseDecodeResult(
        value = GetClimateProductsProductResponse.DefaultJson(
          json = ClimateCodecs.getClimateProductsProductResponseCodecAlternative1Registry.select(listOf("GetClimateProductsProduct.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetClimateProductsProductResponse = GetClimateProductsProductResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetClimateSuppliers`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetClimateSuppliersResponse {
    public class SuccessJson(
      public val json: InlineV1ClimateSuppliersGetResponse200JsonXa7895ef5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateSuppliersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateSuppliersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateSuppliersResponse
  }

  private object GetClimateSuppliersResponseDecoder : SdkResponseAlternativeDecoder<GetClimateSuppliersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetClimateSuppliersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetClimateSuppliersResponse> = when {
      alternative.id == "GetClimateSuppliers.response.alternative0" -> SdkResponseDecodeResult(
        value = GetClimateSuppliersResponse.SuccessJson(
          json = ClimateCodecs.getClimateSuppliersResponseCodecAlternative0Registry.select(listOf("GetClimateSuppliers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetClimateSuppliers.response.alternative1" -> SdkResponseDecodeResult(
        value = GetClimateSuppliersResponse.DefaultJson(
          json = ClimateCodecs.getClimateSuppliersResponseCodecAlternative1Registry.select(listOf("GetClimateSuppliers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetClimateSuppliersResponse = GetClimateSuppliersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetClimateSuppliersSupplier`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetClimateSuppliersSupplierResponse {
    public class SuccessJson(
      public val json: ClimateSupplier,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateSuppliersSupplierResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateSuppliersSupplierResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetClimateSuppliersSupplierResponse
  }

  private object GetClimateSuppliersSupplierResponseDecoder : SdkResponseAlternativeDecoder<GetClimateSuppliersSupplierResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetClimateSuppliersSupplierResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetClimateSuppliersSupplierResponse> = when {
      alternative.id == "GetClimateSuppliersSupplier.response.alternative0" -> SdkResponseDecodeResult(
        value = GetClimateSuppliersSupplierResponse.SuccessJson(
          json = ClimateCodecs.getClimateSuppliersSupplierResponseCodecAlternative0Registry.select(listOf("GetClimateSuppliersSupplier.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetClimateSuppliersSupplier.response.alternative1" -> SdkResponseDecodeResult(
        value = GetClimateSuppliersSupplierResponse.DefaultJson(
          json = ClimateCodecs.getClimateSuppliersSupplierResponseCodecAlternative1Registry.select(listOf("GetClimateSuppliersSupplier.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetClimateSuppliersSupplierResponse = GetClimateSuppliersSupplierResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostClimateOrders`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostClimateOrdersResponse {
    public class SuccessJson(
      public val json: ClimateOrder,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostClimateOrdersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostClimateOrdersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostClimateOrdersResponse
  }

  private object PostClimateOrdersResponseDecoder : SdkResponseAlternativeDecoder<PostClimateOrdersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostClimateOrdersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostClimateOrdersResponse> = when {
      alternative.id == "PostClimateOrders.response.alternative0" -> SdkResponseDecodeResult(
        value = PostClimateOrdersResponse.SuccessJson(
          json = ClimateCodecs.postClimateOrdersResponseCodecAlternative0Registry.select(listOf("PostClimateOrders.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostClimateOrders.response.alternative1" -> SdkResponseDecodeResult(
        value = PostClimateOrdersResponse.DefaultJson(
          json = ClimateCodecs.postClimateOrdersResponseCodecAlternative1Registry.select(listOf("PostClimateOrders.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostClimateOrdersResponse = PostClimateOrdersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostClimateOrdersOrderCancel`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostClimateOrdersOrderCancelResponse {
    public class SuccessJson(
      public val json: ClimateOrder,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostClimateOrdersOrderCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostClimateOrdersOrderCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostClimateOrdersOrderCancelResponse
  }

  private object PostClimateOrdersOrderCancelResponseDecoder : SdkResponseAlternativeDecoder<PostClimateOrdersOrderCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostClimateOrdersOrderCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostClimateOrdersOrderCancelResponse> = when {
      alternative.id == "PostClimateOrdersOrderCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostClimateOrdersOrderCancelResponse.SuccessJson(
          json = ClimateCodecs.postClimateOrdersOrderCancelResponseCodecAlternative0Registry.select(listOf("PostClimateOrdersOrderCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostClimateOrdersOrderCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostClimateOrdersOrderCancelResponse.DefaultJson(
          json = ClimateCodecs.postClimateOrdersOrderCancelResponseCodecAlternative1Registry.select(listOf("PostClimateOrdersOrderCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostClimateOrdersOrderCancelResponse = PostClimateOrdersOrderCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getClimateOrdersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetClimateOrders",
          method = "GET",
          path = "/v1/climate/orders",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ClimateOrdersGetResponse200JsonX912e8c78",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateOrders.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateOrders.response.alternative1",
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

    public val getClimateOrdersOrderMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetClimateOrdersOrder",
          method = "GET",
          path = "/v1/climate/orders/{order}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ClimateOrder",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateOrdersOrder.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateOrdersOrder.response.alternative1",
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

    public val getClimateProductsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetClimateProducts",
          method = "GET",
          path = "/v1/climate/products",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ClimateProductsGetResponse200JsonXe42cab65",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateProducts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateProducts.response.alternative1",
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

    public val getClimateProductsProductMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetClimateProductsProduct",
          method = "GET",
          path = "/v1/climate/products/{product}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ClimateProduct",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateProductsProduct.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateProductsProduct.response.alternative1",
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

    public val getClimateSuppliersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetClimateSuppliers",
          method = "GET",
          path = "/v1/climate/suppliers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ClimateSuppliersGetResponse200JsonXa7895ef5",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateSuppliers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateSuppliers.response.alternative1",
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

    public val getClimateSuppliersSupplierMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetClimateSuppliersSupplier",
          method = "GET",
          path = "/v1/climate/suppliers/{supplier}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ClimateSupplier",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateSuppliersSupplier.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetClimateSuppliersSupplier.response.alternative1",
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

    public val postClimateOrdersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostClimateOrders",
          method = "POST",
          path = "/v1/climate/orders",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ClimateOrder",
              mode = SdkResponseMode.BUFFERED,
              id = "PostClimateOrders.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostClimateOrders.response.alternative1",
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

    public val postClimateOrdersOrderCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostClimateOrdersOrderCancel",
          method = "POST",
          path = "/v1/climate/orders/{order}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ClimateOrder",
              mode = SdkResponseMode.BUFFERED,
              id = "PostClimateOrdersOrderCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostClimateOrdersOrderCancel.response.alternative1",
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
