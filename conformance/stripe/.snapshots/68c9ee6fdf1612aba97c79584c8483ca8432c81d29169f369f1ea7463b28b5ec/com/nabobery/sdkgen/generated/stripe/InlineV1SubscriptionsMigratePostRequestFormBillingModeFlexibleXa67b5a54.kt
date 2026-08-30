package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode/properties/flexible.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode/properties/flexible
 */
@Serializable(with = InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54.Serializer::class)
public class InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54(
  public val prorationDiscounts:
      InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc? = null,
) {
  public class Builder {
    public var prorationDiscounts:
        InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc? = null

    public fun build(): InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54 = InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54(
      prorationDiscounts = prorationDiscounts,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54 must be a JSON object")
      return InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54(
        prorationDiscounts = rawObject["proration_discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54(block: InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54.Builder.() -> Unit): InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54 = InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54.build(block)
