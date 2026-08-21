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
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f(
  paymentMethodAllowRedisplayFilters: List<InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a>? = null,
  public val paymentMethodRedisplay:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayX2d072cae? = null,
  public val paymentMethodRemove:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6? = null,
  public val paymentMethodSave:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa? = null,
  public val paymentMethodSaveAllowRedisplayOverride:
      InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5? = null,
) {
  public val paymentMethodAllowRedisplayFilters:
      List<InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a>? =
      paymentMethodAllowRedisplayFilters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var paymentMethodAllowRedisplayFiltersValue:
        List<InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a>? = null

    public var paymentMethodAllowRedisplayFilters:
        List<InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a>?
      get() = paymentMethodAllowRedisplayFiltersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodAllowRedisplayFiltersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var paymentMethodRedisplay:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayX2d072cae? = null

    public var paymentMethodRemove:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6? = null

    public var paymentMethodSave:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa? = null

    public var paymentMethodSaveAllowRedisplayOverride:
        InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5? = null

    public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f = InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f(
      paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters,
      paymentMethodRedisplay = paymentMethodRedisplay,
      paymentMethodRemove = paymentMethodRemove,
      paymentMethodSave = paymentMethodSave,
      paymentMethodSaveAllowRedisplayOverride = paymentMethodSaveAllowRedisplayOverride,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f must be a JSON object")
      return InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f(
        paymentMethodAllowRedisplayFilters = rawObject["payment_method_allow_redisplay_filters"]?.let { json.decodeFromJsonElement<List<InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a>>(it) },
        paymentMethodRedisplay = rawObject["payment_method_redisplay"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayX2d072cae>(it) },
        paymentMethodRemove = rawObject["payment_method_remove"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6>(it) },
        paymentMethodSave = rawObject["payment_method_save"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa>(it) },
        paymentMethodSaveAllowRedisplayOverride = rawObject["payment_method_save_allow_redisplay_override"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodAllowRedisplayFilters?.let { put("payment_method_allow_redisplay_filters", json.encodeToJsonElement(it)) }
        value.paymentMethodRedisplay?.let { put("payment_method_redisplay", json.encodeToJsonElement(it)) }
        value.paymentMethodRemove?.let { put("payment_method_remove", json.encodeToJsonElement(it)) }
        value.paymentMethodSave?.let { put("payment_method_save", json.encodeToJsonElement(it)) }
        value.paymentMethodSaveAllowRedisplayOverride?.let { put("payment_method_save_allow_redisplay_override", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f(block: InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f = InlineV1CustomerSessionsPostRequestFormComponentsFeaturesX81cbb57f.build(block)
