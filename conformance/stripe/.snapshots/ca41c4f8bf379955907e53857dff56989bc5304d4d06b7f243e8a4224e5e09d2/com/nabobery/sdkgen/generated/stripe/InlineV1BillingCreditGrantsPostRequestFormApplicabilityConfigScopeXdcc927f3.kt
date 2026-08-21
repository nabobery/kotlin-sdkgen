package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config/properties/scope.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config/properties/scope
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3(
  public val priceType:
      InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7? = null,
  prices: List<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8>? = null,
) {
  public val prices:
      List<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8>? =
      prices?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var priceType:
        InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7? = null

    private var pricesValue:
        List<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8>? =
        null

    public var prices:
        List<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8>?
      get() = pricesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pricesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3 = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3(
      priceType = priceType,
      prices = prices,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3 must be a JSON object")
      return InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3(
        priceType = rawObject["price_type"]?.let { json.decodeFromJsonElement<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7>(it) },
        prices = rawObject["prices"]?.let { json.decodeFromJsonElement<List<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeItemXf9106dc8>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.priceType?.let { put("price_type", json.encodeToJsonElement(it)) }
        value.prices?.let { put("prices", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3(block: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3 = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigScopeXdcc927f3.build(block)
