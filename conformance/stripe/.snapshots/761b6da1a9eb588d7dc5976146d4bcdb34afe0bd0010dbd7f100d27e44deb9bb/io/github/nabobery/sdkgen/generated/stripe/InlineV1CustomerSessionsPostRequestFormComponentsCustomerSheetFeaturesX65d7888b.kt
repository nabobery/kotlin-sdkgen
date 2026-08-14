package io.github.nabobery.sdkgen.generated.stripe

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
 * ed/schema/properties/components/properties/customer_sheet/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/customer_sheet/properties/features
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b(
  paymentMethodAllowRedisplayFilters: List<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetItemXf4c0cecf>? = null,
  public val paymentMethodRemove:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX68c6af72? = null,
) {
  public val paymentMethodAllowRedisplayFilters:
      List<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetItemXf4c0cecf>? =
      paymentMethodAllowRedisplayFilters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var paymentMethodAllowRedisplayFiltersValue:
        List<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetItemXf4c0cecf>? = null

    public var paymentMethodAllowRedisplayFilters:
        List<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetItemXf4c0cecf>?
      get() = paymentMethodAllowRedisplayFiltersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodAllowRedisplayFiltersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var paymentMethodRemove:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX68c6af72? = null

    public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b = InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b(
      paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters,
      paymentMethodRemove = paymentMethodRemove,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b must be a JSON object")
      return InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b(
        paymentMethodAllowRedisplayFilters = rawObject["payment_method_allow_redisplay_filters"]?.let { json.decodeFromJsonElement<List<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetItemXf4c0cecf>>(it) },
        paymentMethodRemove = rawObject["payment_method_remove"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX68c6af72>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodAllowRedisplayFilters?.let { put("payment_method_allow_redisplay_filters", json.encodeToJsonElement(it)) }
        value.paymentMethodRemove?.let { put("payment_method_remove", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b(block: InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b = InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b.build(block)
