package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * ed/schema/properties/components/properties/payment_element/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/payment_element/properties/features
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf(
  paymentMethodAllowRedisplayFilters: List<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementItemX22662702>? = null,
  public val paymentMethodRedisplay:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733? = null,
  public val paymentMethodRedisplayLimit: Int? = null,
  public val paymentMethodRemove:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX8c4d8d30? = null,
  public val paymentMethodSave:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX15f29594? = null,
  public val paymentMethodSaveUsage:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd? = null,
) {
  public val paymentMethodAllowRedisplayFilters:
      List<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementItemX22662702>? =
      paymentMethodAllowRedisplayFilters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var paymentMethodAllowRedisplayFiltersValue:
        List<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementItemX22662702>? = null

    public var paymentMethodAllowRedisplayFilters:
        List<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementItemX22662702>?
      get() = paymentMethodAllowRedisplayFiltersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodAllowRedisplayFiltersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var paymentMethodRedisplay:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733? = null

    public var paymentMethodRedisplayLimit: Int? = null

    public var paymentMethodRemove:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX8c4d8d30? = null

    public var paymentMethodSave:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX15f29594? = null

    public var paymentMethodSaveUsage:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd? = null

    public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf = InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf(
      paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters,
      paymentMethodRedisplay = paymentMethodRedisplay,
      paymentMethodRedisplayLimit = paymentMethodRedisplayLimit,
      paymentMethodRemove = paymentMethodRemove,
      paymentMethodSave = paymentMethodSave,
      paymentMethodSaveUsage = paymentMethodSaveUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf must be a JSON object")
      return InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf(
        paymentMethodAllowRedisplayFilters = rawObject["payment_method_allow_redisplay_filters"]?.let { json.decodeFromJsonElement<List<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementItemX22662702>>(it) },
        paymentMethodRedisplay = rawObject["payment_method_redisplay"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733>(it) },
        paymentMethodRedisplayLimit = rawObject["payment_method_redisplay_limit"]?.let { json.decodeFromJsonElement<Int>(it) },
        paymentMethodRemove = rawObject["payment_method_remove"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX8c4d8d30>(it) },
        paymentMethodSave = rawObject["payment_method_save"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX15f29594>(it) },
        paymentMethodSaveUsage = rawObject["payment_method_save_usage"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodAllowRedisplayFilters?.let { put("payment_method_allow_redisplay_filters", json.encodeToJsonElement(it)) }
        value.paymentMethodRedisplay?.let { put("payment_method_redisplay", json.encodeToJsonElement(it)) }
        value.paymentMethodRedisplayLimit?.let { put("payment_method_redisplay_limit", json.encodeToJsonElement(it)) }
        value.paymentMethodRemove?.let { put("payment_method_remove", json.encodeToJsonElement(it)) }
        value.paymentMethodSave?.let { put("payment_method_save", json.encodeToJsonElement(it)) }
        value.paymentMethodSaveUsage?.let { put("payment_method_save_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf(block: InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf = InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf.build(block)
