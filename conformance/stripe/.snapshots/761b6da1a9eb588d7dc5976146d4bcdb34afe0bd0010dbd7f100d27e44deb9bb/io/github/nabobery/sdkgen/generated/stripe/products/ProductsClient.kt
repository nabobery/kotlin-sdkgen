package io.github.nabobery.sdkgen.generated.stripe.products

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
import io.github.nabobery.sdkgen.generated.stripe.DeletedProduct
import io.github.nabobery.sdkgen.generated.stripe.DeletedProductFeature
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsFeaturesGetResponse200JsonX8557a15d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsFeaturesPostRequestFormXa8a76f9a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsGetParameterXca1d8d3d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsGetResponse200JsonXc1782077
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsPostRequestFormX10c55a15
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsSearchGetResponse200JsonX7f669f32
import io.github.nabobery.sdkgen.generated.stripe.Product
import io.github.nabobery.sdkgen.generated.stripe.ProductFeature
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object ProductsCodecs {
  internal const val DELETEPRODUCTSID_REQUEST_CODEC_ID: String = "DeleteProductsId.request"

  private val deleteProductsIdRequestCodec: MediaTypeCodec<JsonObject?> = DeleteProductsIdFormCodec

  private val deleteProductsIdResponseCodecAlternative0Codec: MediaTypeCodec<DeletedProduct> =
      KotlinxSerializationCodec("DeleteProductsId.response.alternative0", DeletedProduct.Serializer, SdkJson)

  internal val deleteProductsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedProduct> =
      MediaTypeCodecRegistry.of(deleteProductsIdResponseCodecAlternative0Codec)

  private val deleteProductsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteProductsId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteProductsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteProductsIdResponseCodecAlternative1Codec)

  internal val deleteProductsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteProductsIdRequestCodec)

  internal const val DELETEPRODUCTSPRODUCTFEATURESID_REQUEST_CODEC_ID: String =
      "DeleteProductsProductFeaturesId.request"

  private val deleteProductsProductFeaturesIdRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteProductsProductFeaturesIdFormCodec

  private val deleteProductsProductFeaturesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedProductFeature> =
      KotlinxSerializationCodec("DeleteProductsProductFeaturesId.response.alternative0", DeletedProductFeature.Serializer, SdkJson)

  internal val deleteProductsProductFeaturesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedProductFeature> =
      MediaTypeCodecRegistry.of(deleteProductsProductFeaturesIdResponseCodecAlternative0Codec)

  private val deleteProductsProductFeaturesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteProductsProductFeaturesId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteProductsProductFeaturesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteProductsProductFeaturesIdResponseCodecAlternative1Codec)

  internal val deleteProductsProductFeaturesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteProductsProductFeaturesIdRequestCodec)

  internal const val GETPRODUCTS_REQUEST_CODEC_ID: String = "GetProducts.request"

  private val getProductsRequestCodec: MediaTypeCodec<JsonObject?> = GetProductsFormCodec

  private val getProductsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ProductsGetResponse200JsonXc1782077> =
      KotlinxSerializationCodec("GetProducts.response.alternative0", InlineV1ProductsGetResponse200JsonXc1782077.Serializer, SdkJson)

  internal val getProductsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ProductsGetResponse200JsonXc1782077> =
      MediaTypeCodecRegistry.of(getProductsResponseCodecAlternative0Codec)

  private val getProductsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetProducts.response.alternative1", Error.Serializer, SdkJson)

  internal val getProductsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getProductsResponseCodecAlternative1Codec)

  internal val getProductsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getProductsRequestCodec)

  internal const val GETPRODUCTSID_REQUEST_CODEC_ID: String = "GetProductsId.request"

  private val getProductsIdRequestCodec: MediaTypeCodec<JsonObject?> = GetProductsIdFormCodec

  private val getProductsIdResponseCodecAlternative0Codec: MediaTypeCodec<Product> =
      KotlinxSerializationCodec("GetProductsId.response.alternative0", Product.Serializer, SdkJson)

  internal val getProductsIdResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Product> =
      MediaTypeCodecRegistry.of(getProductsIdResponseCodecAlternative0Codec)

  private val getProductsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetProductsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getProductsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getProductsIdResponseCodecAlternative1Codec)

  internal val getProductsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getProductsIdRequestCodec)

  internal const val GETPRODUCTSPRODUCTFEATURES_REQUEST_CODEC_ID: String =
      "GetProductsProductFeatures.request"

  private val getProductsProductFeaturesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetProductsProductFeaturesFormCodec

  private val getProductsProductFeaturesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ProductsFeaturesGetResponse200JsonX8557a15d> =
      KotlinxSerializationCodec("GetProductsProductFeatures.response.alternative0", InlineV1ProductsFeaturesGetResponse200JsonX8557a15d.Serializer, SdkJson)

  internal val getProductsProductFeaturesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ProductsFeaturesGetResponse200JsonX8557a15d> =
      MediaTypeCodecRegistry.of(getProductsProductFeaturesResponseCodecAlternative0Codec)

  private val getProductsProductFeaturesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetProductsProductFeatures.response.alternative1", Error.Serializer, SdkJson)

  internal val getProductsProductFeaturesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getProductsProductFeaturesResponseCodecAlternative1Codec)

  internal val getProductsProductFeaturesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getProductsProductFeaturesRequestCodec)

  internal const val GETPRODUCTSPRODUCTFEATURESID_REQUEST_CODEC_ID: String =
      "GetProductsProductFeaturesId.request"

  private val getProductsProductFeaturesIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetProductsProductFeaturesIdFormCodec

  private val getProductsProductFeaturesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<ProductFeature> =
      KotlinxSerializationCodec("GetProductsProductFeaturesId.response.alternative0", ProductFeature.Serializer, SdkJson)

  internal val getProductsProductFeaturesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProductFeature> =
      MediaTypeCodecRegistry.of(getProductsProductFeaturesIdResponseCodecAlternative0Codec)

  private val getProductsProductFeaturesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetProductsProductFeaturesId.response.alternative1", Error.Serializer, SdkJson)

  internal val getProductsProductFeaturesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getProductsProductFeaturesIdResponseCodecAlternative1Codec)

  internal val getProductsProductFeaturesIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getProductsProductFeaturesIdRequestCodec)

  internal const val GETPRODUCTSSEARCH_REQUEST_CODEC_ID: String = "GetProductsSearch.request"

  private val getProductsSearchRequestCodec: MediaTypeCodec<JsonObject?> =
      GetProductsSearchFormCodec

  private val getProductsSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ProductsSearchGetResponse200JsonX7f669f32> =
      KotlinxSerializationCodec("GetProductsSearch.response.alternative0", InlineV1ProductsSearchGetResponse200JsonX7f669f32.Serializer, SdkJson)

  internal val getProductsSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ProductsSearchGetResponse200JsonX7f669f32> =
      MediaTypeCodecRegistry.of(getProductsSearchResponseCodecAlternative0Codec)

  private val getProductsSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetProductsSearch.response.alternative1", Error.Serializer, SdkJson)

  internal val getProductsSearchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getProductsSearchResponseCodecAlternative1Codec)

  internal val getProductsSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getProductsSearchRequestCodec)

  internal const val POSTPRODUCTS_REQUEST_CODEC_ID: String = "PostProducts.request"

  private val postProductsRequestCodec: MediaTypeCodec<InlineV1ProductsPostRequestFormX10c55a15> =
      PostProductsFormCodec

  private val postProductsResponseCodecAlternative0Codec: MediaTypeCodec<Product> =
      KotlinxSerializationCodec("PostProducts.response.alternative0", Product.Serializer, SdkJson)

  internal val postProductsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Product> =
      MediaTypeCodecRegistry.of(postProductsResponseCodecAlternative0Codec)

  private val postProductsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostProducts.response.alternative1", Error.Serializer, SdkJson)

  internal val postProductsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postProductsResponseCodecAlternative1Codec)

  internal val postProductsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ProductsPostRequestFormX10c55a15> =
      MediaTypeCodecRegistry.of(postProductsRequestCodec)

  internal const val POSTPRODUCTSPRODUCTFEATURES_REQUEST_CODEC_ID: String =
      "PostProductsProductFeatures.request"

  private val postProductsProductFeaturesRequestCodec:
      MediaTypeCodec<InlineV1ProductsFeaturesPostRequestFormXa8a76f9a> =
      PostProductsProductFeaturesFormCodec

  private val postProductsProductFeaturesResponseCodecAlternative0Codec:
      MediaTypeCodec<ProductFeature> =
      KotlinxSerializationCodec("PostProductsProductFeatures.response.alternative0", ProductFeature.Serializer, SdkJson)

  internal val postProductsProductFeaturesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProductFeature> =
      MediaTypeCodecRegistry.of(postProductsProductFeaturesResponseCodecAlternative0Codec)

  private val postProductsProductFeaturesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostProductsProductFeatures.response.alternative1", Error.Serializer, SdkJson)

  internal val postProductsProductFeaturesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postProductsProductFeaturesResponseCodecAlternative1Codec)

  internal val postProductsProductFeaturesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ProductsFeaturesPostRequestFormXa8a76f9a> =
      MediaTypeCodecRegistry.of(postProductsProductFeaturesRequestCodec)

  internal object DeleteProductsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteProductsId.request"

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

  internal object DeleteProductsProductFeaturesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteProductsProductFeaturesId.request"

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

  internal object GetProductsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetProducts.request"

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

  internal object GetProductsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetProductsId.request"

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

  internal object GetProductsProductFeaturesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetProductsProductFeatures.request"

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

  internal object GetProductsProductFeaturesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetProductsProductFeaturesId.request"

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

  internal object GetProductsSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetProductsSearch.request"

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

  internal object PostProductsFormCodec : MediaTypeCodec<InlineV1ProductsPostRequestFormX10c55a15> {
    override val id: String = "PostProducts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ProductsPostRequestFormX10c55a15, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.defaultPriceData?.let { formValue0 ->
        form.add("default_price_data" + "[currency]", formValue0.currency)
        formValue0.currencyOptions?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            formMapValue3.customUnitAmount?.let { formValue5 ->
              form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[custom_unit_amount]" + "[enabled]", formValue5.enabled.toString())
              formValue5.maximum?.let { formValue7 ->
                form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[custom_unit_amount]" + "[maximum]", formValue7.toString())
              }
              formValue5.minimum?.let { formValue7 ->
                form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[custom_unit_amount]" + "[minimum]", formValue7.toString())
              }
              formValue5.preset?.let { formValue7 ->
                form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[custom_unit_amount]" + "[preset]", formValue7.toString())
              }
            }
            formMapValue3.taxBehavior?.let { formValue5 ->
              form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tax_behavior]", formValue5.value)
            }
            formMapValue3.tiers?.let { formValue5 ->
              if (formValue5.isEmpty()) {
                form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]", "")
              } else {
                formValue5.forEachIndexed { formIndex6, formElement6 ->
                  formElement6.flatAmount?.let { formValue8 ->
                    form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]" + "[" + formIndex6 + "]" + "[flat_amount]", formValue8.toString())
                  }
                  formElement6.flatAmountDecimal?.let { formValue8 ->
                    form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]" + "[" + formIndex6 + "]" + "[flat_amount_decimal]", formValue8)
                  }
                  formElement6.unitAmount?.let { formValue8 ->
                    form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]" + "[" + formIndex6 + "]" + "[unit_amount]", formValue8.toString())
                  }
                  formElement6.unitAmountDecimal?.let { formValue8 ->
                    form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]" + "[" + formIndex6 + "]" + "[unit_amount_decimal]", formValue8)
                  }
                  require(formElement6.upTo.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
                  when {
                    formElement6.upTo.inlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5 != null -> {
                      form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]" + "[" + formIndex6 + "]" + "[up_to]", requireNotNull(formElement6.upTo.inlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5).value)
                    }
                    formElement6.upTo.branch2 != null -> {
                      form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[tiers]" + "[" + formIndex6 + "]" + "[up_to]", requireNotNull(formElement6.upTo.branch2).toString())
                    }
                    else -> {
                      error("Form union value has no selected branch")
                    }
                  }
                }
              }
            }
            formMapValue3.unitAmount?.let { formValue5 ->
              form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[unit_amount]", formValue5.toString())
            }
            formMapValue3.unitAmountDecimal?.let { formValue5 ->
              form.add("default_price_data" + "[currency_options]" + "[" + formKey3 + "]" + "[unit_amount_decimal]", formValue5)
            }
          }
        }
        formValue0.customUnitAmount?.let { formValue2 ->
          form.add("default_price_data" + "[custom_unit_amount]" + "[enabled]", formValue2.enabled.toString())
          formValue2.maximum?.let { formValue4 ->
            form.add("default_price_data" + "[custom_unit_amount]" + "[maximum]", formValue4.toString())
          }
          formValue2.minimum?.let { formValue4 ->
            form.add("default_price_data" + "[custom_unit_amount]" + "[minimum]", formValue4.toString())
          }
          formValue2.preset?.let { formValue4 ->
            form.add("default_price_data" + "[custom_unit_amount]" + "[preset]", formValue4.toString())
          }
        }
        formValue0.metadata?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            form.add("default_price_data" + "[metadata]" + "[" + formKey3 + "]", formMapValue3)
          }
        }
        formValue0.recurring?.let { formValue2 ->
          form.add("default_price_data" + "[recurring]" + "[interval]", formValue2.interval.value)
          formValue2.intervalCount?.let { formValue4 ->
            form.add("default_price_data" + "[recurring]" + "[interval_count]", formValue4.toString())
          }
        }
        formValue0.taxBehavior?.let { formValue2 ->
          form.add("default_price_data" + "[tax_behavior]", formValue2.value)
        }
        formValue0.unitAmount?.let { formValue2 ->
          form.add("default_price_data" + "[unit_amount]", formValue2.toString())
        }
        formValue0.unitAmountDecimal?.let { formValue2 ->
          form.add("default_price_data" + "[unit_amount_decimal]", formValue2)
        }
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
      request.id?.let { formValue0 ->
        form.add("id", formValue0)
      }
      request.images?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("images", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("images" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.marketingFeatures?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("marketing_features", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("marketing_features" + "[" + formIndex1 + "]" + "[name]", formElement1.name)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("name", request.name)
      request.packageDimensions?.let { formValue0 ->
        form.add("package_dimensions" + "[height]", formValue0.height)
        form.add("package_dimensions" + "[length]", formValue0.length)
        form.add("package_dimensions" + "[weight]", formValue0.weight)
        form.add("package_dimensions" + "[width]", formValue0.width)
      }
      request.shippable?.let { formValue0 ->
        form.add("shippable", formValue0.toString())
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      request.taxCode?.let { formValue0 ->
        form.add("tax_code", formValue0)
      }
      request.unitLabel?.let { formValue0 ->
        form.add("unit_label", formValue0)
      }
      request.url?.let { formValue0 ->
        form.add("url", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ProductsPostRequestFormX10c55a15 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostProductsProductFeaturesFormCodec : MediaTypeCodec<InlineV1ProductsFeaturesPostRequestFormXa8a76f9a> {
    override val id: String = "PostProductsProductFeatures.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ProductsFeaturesPostRequestFormXa8a76f9a, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("entitlement_feature", request.entitlementFeature)
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ProductsFeaturesPostRequestFormXa8a76f9a {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'products' group of Stripe API.
 */
public class ProductsClient(
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
      SdkExecutor(transport, authentication = this@ProductsClient.authentication)

  /**
   * <p>Delete a product. Deleting a product is only possible if it has no prices associated with it. Additionally,
   * deleting a product with <code>type=good</code> is only possible if it has no SKUs associated with it.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun deleteProductsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteProductsIdResponse> = executor.executeWithResponse<JsonObject?, DeleteProductsIdResponse>(SdkExecutionRequest(deleteProductsIdMetadata, baseUri, request, listOf(ProductsCodecs.DELETEPRODUCTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), ProductsCodecs.deleteProductsIdRequestCodecRegistry, DeleteProductsIdResponseDecoder, options)

  /**
   * <p>Deletes the feature attachment to a product</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param product Wire parameter `product`.
   * @param options Execution options.
   */
  public suspend fun deleteProductsProductFeaturesIdWithResponse(
    request: JsonObject? = null,
    id: String,
    product: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteProductsProductFeaturesIdResponse> = executor.executeWithResponse<JsonObject?, DeleteProductsProductFeaturesIdResponse>(SdkExecutionRequest(deleteProductsProductFeaturesIdMetadata, baseUri, request, listOf(ProductsCodecs.DELETEPRODUCTSPRODUCTFEATURESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "product", values = listOf(product.toString())))
  }), ProductsCodecs.deleteProductsProductFeaturesIdRequestCodecRegistry, DeleteProductsProductFeaturesIdResponseDecoder, options)

  /**
   * <p>Returns a list of your products. The products are returned sorted by creation date, with the most recently
   * created products appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Only return products that are active or inactive (e.g., pass `false` to list all inactive products).
   * @param created Only return products that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param ids Only return products with the given IDs. Cannot be used with
   * [starting_after](https://api.stripe.com#list_products-starting_after) or
   * [ending_before](https://api.stripe.com#list_products-ending_before).
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param shippable Only return products that can be shipped (i.e., physical, not digital products).
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param url Only return products with the given url.
   * @param options Execution options.
   */
  public suspend fun getProductsWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    created: InlineV1ProductsGetParameterXca1d8d3d? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    ids: List<String>? = null,
    limit: Int? = null,
    shippable: Boolean? = null,
    startingAfter: String? = null,
    url: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetProductsResponse> = executor.executeWithResponse<JsonObject?, GetProductsResponse>(SdkExecutionRequest(getProductsMetadata, baseUri, request, listOf(ProductsCodecs.GETPRODUCTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    ids?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ids" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "shippable", values = shippable?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "url", values = url?.let { listOf(it.toString()) }.orEmpty()))
  }), ProductsCodecs.getProductsRequestCodecRegistry, GetProductsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing product. Supply the unique product ID from either a product creation
   * request or the product list, and Stripe will return the corresponding product information.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getProductsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetProductsIdResponse> = executor.executeWithResponse<JsonObject?, GetProductsIdResponse>(SdkExecutionRequest(getProductsIdMetadata, baseUri, request, listOf(ProductsCodecs.GETPRODUCTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ProductsCodecs.getProductsIdRequestCodecRegistry, GetProductsIdResponseDecoder, options)

  /**
   * <p>Retrieve a list of features for a product</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param product Wire parameter `product`.
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
  public suspend fun getProductsProductFeaturesWithResponse(
    request: JsonObject? = null,
    product: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetProductsProductFeaturesResponse> = executor.executeWithResponse<JsonObject?, GetProductsProductFeaturesResponse>(SdkExecutionRequest(getProductsProductFeaturesMetadata, baseUri, request, listOf(ProductsCodecs.GETPRODUCTSPRODUCTFEATURES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "product", values = listOf(product.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ProductsCodecs.getProductsProductFeaturesRequestCodecRegistry, GetProductsProductFeaturesResponseDecoder, options)

  /**
   * <p>Retrieves a product_feature, which represents a feature attachment to a product</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the product_feature.
   * @param product The ID of the product.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getProductsProductFeaturesIdWithResponse(
    request: JsonObject? = null,
    id: String,
    product: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetProductsProductFeaturesIdResponse> = executor.executeWithResponse<JsonObject?, GetProductsProductFeaturesIdResponse>(SdkExecutionRequest(getProductsProductFeaturesIdMetadata, baseUri, request, listOf(ProductsCodecs.GETPRODUCTSPRODUCTFEATURESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "product", values = listOf(product.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ProductsCodecs.getProductsProductFeaturesIdRequestCodecRegistry, GetProductsProductFeaturesIdResponseDecoder, options)

  /**
   * <p>Search for products you’ve previously created using Stripe’s <a href="/docs/search#search-query-language">Search
   * Query Language</a>.
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
   * products](https://docs.stripe.com/search#query-fields-for-products).
   * @param options Execution options.
   */
  public suspend fun getProductsSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetProductsSearchResponse> = executor.executeWithResponse<JsonObject?, GetProductsSearchResponse>(SdkExecutionRequest(getProductsSearchMetadata, baseUri, request, listOf(ProductsCodecs.GETPRODUCTSSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), ProductsCodecs.getProductsSearchRequestCodecRegistry, GetProductsSearchResponseDecoder, options)

  /**
   * <p>Creates a new product object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postProductsWithResponse(request: InlineV1ProductsPostRequestFormX10c55a15, options: CallOptions = CallOptions()): SdkResponseResult<PostProductsResponse> = executor.executeWithResponse<InlineV1ProductsPostRequestFormX10c55a15, PostProductsResponse>(SdkExecutionRequest(postProductsMetadata, baseUri, request, listOf(ProductsCodecs.POSTPRODUCTS_REQUEST_CODEC_ID), emptyList()), ProductsCodecs.postProductsRequestCodecRegistry, PostProductsResponseDecoder, options)

  /**
   * <p>Creates a product_feature, which represents a feature attachment to a product</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param product Wire parameter `product`.
   * @param options Execution options.
   */
  public suspend fun postProductsProductFeaturesWithResponse(
    request: InlineV1ProductsFeaturesPostRequestFormXa8a76f9a,
    product: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostProductsProductFeaturesResponse> = executor.executeWithResponse<InlineV1ProductsFeaturesPostRequestFormXa8a76f9a, PostProductsProductFeaturesResponse>(SdkExecutionRequest(postProductsProductFeaturesMetadata, baseUri, request, listOf(ProductsCodecs.POSTPRODUCTSPRODUCTFEATURES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "product", values = listOf(product.toString())))
  }), ProductsCodecs.postProductsProductFeaturesRequestCodecRegistry, PostProductsProductFeaturesResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteProductsId`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteProductsIdResponse {
    public class SuccessJson(
      public val json: DeletedProduct,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteProductsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteProductsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteProductsIdResponse
  }

  private object DeleteProductsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteProductsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteProductsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteProductsIdResponse> = when {
      alternative.id == "DeleteProductsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteProductsIdResponse.SuccessJson(
          json = ProductsCodecs.deleteProductsIdResponseCodecAlternative0Registry.select(listOf("DeleteProductsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteProductsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteProductsIdResponse.DefaultJson(
          json = ProductsCodecs.deleteProductsIdResponseCodecAlternative1Registry.select(listOf("DeleteProductsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteProductsIdResponse = DeleteProductsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteProductsProductFeaturesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteProductsProductFeaturesIdResponse {
    public class SuccessJson(
      public val json: DeletedProductFeature,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteProductsProductFeaturesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteProductsProductFeaturesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteProductsProductFeaturesIdResponse
  }

  private object DeleteProductsProductFeaturesIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteProductsProductFeaturesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteProductsProductFeaturesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteProductsProductFeaturesIdResponse> = when {
      alternative.id == "DeleteProductsProductFeaturesId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteProductsProductFeaturesIdResponse.SuccessJson(
          json = ProductsCodecs.deleteProductsProductFeaturesIdResponseCodecAlternative0Registry.select(listOf("DeleteProductsProductFeaturesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteProductsProductFeaturesId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteProductsProductFeaturesIdResponse.DefaultJson(
          json = ProductsCodecs.deleteProductsProductFeaturesIdResponseCodecAlternative1Registry.select(listOf("DeleteProductsProductFeaturesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteProductsProductFeaturesIdResponse = DeleteProductsProductFeaturesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetProducts`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetProductsResponse {
    public class SuccessJson(
      public val json: InlineV1ProductsGetResponse200JsonXc1782077,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsResponse
  }

  private object GetProductsResponseDecoder : SdkResponseAlternativeDecoder<GetProductsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetProductsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetProductsResponse> = when {
      alternative.id == "GetProducts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetProductsResponse.SuccessJson(
          json = ProductsCodecs.getProductsResponseCodecAlternative0Registry.select(listOf("GetProducts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetProducts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetProductsResponse.DefaultJson(
          json = ProductsCodecs.getProductsResponseCodecAlternative1Registry.select(listOf("GetProducts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetProductsResponse = GetProductsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetProductsId`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetProductsIdResponse {
    public class SuccessJson(
      public val json: Product,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsIdResponse
  }

  private object GetProductsIdResponseDecoder : SdkResponseAlternativeDecoder<GetProductsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetProductsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetProductsIdResponse> = when {
      alternative.id == "GetProductsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetProductsIdResponse.SuccessJson(
          json = ProductsCodecs.getProductsIdResponseCodecAlternative0Registry.select(listOf("GetProductsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetProductsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetProductsIdResponse.DefaultJson(
          json = ProductsCodecs.getProductsIdResponseCodecAlternative1Registry.select(listOf("GetProductsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetProductsIdResponse = GetProductsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetProductsProductFeatures`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetProductsProductFeaturesResponse {
    public class SuccessJson(
      public val json: InlineV1ProductsFeaturesGetResponse200JsonX8557a15d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsProductFeaturesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsProductFeaturesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsProductFeaturesResponse
  }

  private object GetProductsProductFeaturesResponseDecoder : SdkResponseAlternativeDecoder<GetProductsProductFeaturesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetProductsProductFeaturesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetProductsProductFeaturesResponse> = when {
      alternative.id == "GetProductsProductFeatures.response.alternative0" -> SdkResponseDecodeResult(
        value = GetProductsProductFeaturesResponse.SuccessJson(
          json = ProductsCodecs.getProductsProductFeaturesResponseCodecAlternative0Registry.select(listOf("GetProductsProductFeatures.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetProductsProductFeatures.response.alternative1" -> SdkResponseDecodeResult(
        value = GetProductsProductFeaturesResponse.DefaultJson(
          json = ProductsCodecs.getProductsProductFeaturesResponseCodecAlternative1Registry.select(listOf("GetProductsProductFeatures.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetProductsProductFeaturesResponse = GetProductsProductFeaturesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetProductsProductFeaturesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetProductsProductFeaturesIdResponse {
    public class SuccessJson(
      public val json: ProductFeature,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsProductFeaturesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsProductFeaturesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsProductFeaturesIdResponse
  }

  private object GetProductsProductFeaturesIdResponseDecoder : SdkResponseAlternativeDecoder<GetProductsProductFeaturesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetProductsProductFeaturesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetProductsProductFeaturesIdResponse> = when {
      alternative.id == "GetProductsProductFeaturesId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetProductsProductFeaturesIdResponse.SuccessJson(
          json = ProductsCodecs.getProductsProductFeaturesIdResponseCodecAlternative0Registry.select(listOf("GetProductsProductFeaturesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetProductsProductFeaturesId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetProductsProductFeaturesIdResponse.DefaultJson(
          json = ProductsCodecs.getProductsProductFeaturesIdResponseCodecAlternative1Registry.select(listOf("GetProductsProductFeaturesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetProductsProductFeaturesIdResponse = GetProductsProductFeaturesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetProductsSearch`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetProductsSearchResponse {
    public class SuccessJson(
      public val json: InlineV1ProductsSearchGetResponse200JsonX7f669f32,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetProductsSearchResponse
  }

  private object GetProductsSearchResponseDecoder : SdkResponseAlternativeDecoder<GetProductsSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetProductsSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetProductsSearchResponse> = when {
      alternative.id == "GetProductsSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetProductsSearchResponse.SuccessJson(
          json = ProductsCodecs.getProductsSearchResponseCodecAlternative0Registry.select(listOf("GetProductsSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetProductsSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetProductsSearchResponse.DefaultJson(
          json = ProductsCodecs.getProductsSearchResponseCodecAlternative1Registry.select(listOf("GetProductsSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetProductsSearchResponse = GetProductsSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostProducts`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostProductsResponse {
    public class SuccessJson(
      public val json: Product,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostProductsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostProductsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostProductsResponse
  }

  private object PostProductsResponseDecoder : SdkResponseAlternativeDecoder<PostProductsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostProductsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostProductsResponse> = when {
      alternative.id == "PostProducts.response.alternative0" -> SdkResponseDecodeResult(
        value = PostProductsResponse.SuccessJson(
          json = ProductsCodecs.postProductsResponseCodecAlternative0Registry.select(listOf("PostProducts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostProducts.response.alternative1" -> SdkResponseDecodeResult(
        value = PostProductsResponse.DefaultJson(
          json = ProductsCodecs.postProductsResponseCodecAlternative1Registry.select(listOf("PostProducts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostProductsResponse = PostProductsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostProductsProductFeatures`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostProductsProductFeaturesResponse {
    public class SuccessJson(
      public val json: ProductFeature,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostProductsProductFeaturesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostProductsProductFeaturesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostProductsProductFeaturesResponse
  }

  private object PostProductsProductFeaturesResponseDecoder : SdkResponseAlternativeDecoder<PostProductsProductFeaturesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostProductsProductFeaturesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostProductsProductFeaturesResponse> = when {
      alternative.id == "PostProductsProductFeatures.response.alternative0" -> SdkResponseDecodeResult(
        value = PostProductsProductFeaturesResponse.SuccessJson(
          json = ProductsCodecs.postProductsProductFeaturesResponseCodecAlternative0Registry.select(listOf("PostProductsProductFeatures.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostProductsProductFeatures.response.alternative1" -> SdkResponseDecodeResult(
        value = PostProductsProductFeaturesResponse.DefaultJson(
          json = ProductsCodecs.postProductsProductFeaturesResponseCodecAlternative1Registry.select(listOf("PostProductsProductFeatures.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostProductsProductFeaturesResponse = PostProductsProductFeaturesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteProductsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteProductsId",
          method = "DELETE",
          path = "/v1/products/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedProduct",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteProductsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteProductsId.response.alternative1",
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

    internal val deleteProductsProductFeaturesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteProductsProductFeaturesId",
          method = "DELETE",
          path = "/v1/products/{product}/features/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedProductFeature",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteProductsProductFeaturesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteProductsProductFeaturesId.response.alternative1",
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

    internal val getProductsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetProducts",
          method = "GET",
          path = "/v1/products",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ProductsGetResponse200JsonXc1782077",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProducts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProducts.response.alternative1",
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

    internal val getProductsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetProductsId",
          method = "GET",
          path = "/v1/products/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Product",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsId.response.alternative1",
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

    internal val getProductsProductFeaturesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetProductsProductFeatures",
          method = "GET",
          path = "/v1/products/{product}/features",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ProductsFeaturesGetResponse200JsonX8557a15d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsProductFeatures.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsProductFeatures.response.alternative1",
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

    internal val getProductsProductFeaturesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetProductsProductFeaturesId",
          method = "GET",
          path = "/v1/products/{product}/features/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProductFeature",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsProductFeaturesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsProductFeaturesId.response.alternative1",
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

    internal val getProductsSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetProductsSearch",
          method = "GET",
          path = "/v1/products/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ProductsSearchGetResponse200JsonX7f669f32",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetProductsSearch.response.alternative1",
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

    internal val postProductsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostProducts",
          method = "POST",
          path = "/v1/products",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Product",
              mode = SdkResponseMode.BUFFERED,
              id = "PostProducts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostProducts.response.alternative1",
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

    internal val postProductsProductFeaturesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostProductsProductFeatures",
          method = "POST",
          path = "/v1/products/{product}/features",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProductFeature",
              mode = SdkResponseMode.BUFFERED,
              id = "PostProductsProductFeatures.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostProductsProductFeatures.response.alternative1",
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
