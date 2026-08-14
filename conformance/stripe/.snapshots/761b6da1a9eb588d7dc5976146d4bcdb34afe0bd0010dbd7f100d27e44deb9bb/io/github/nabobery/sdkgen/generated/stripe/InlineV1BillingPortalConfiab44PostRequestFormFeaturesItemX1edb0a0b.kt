package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_period_end/propertie
 * s/conditions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_period_end/propertie
 * s/conditions/items
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b(
  public val type: InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd,
) {
  public class Builder {
    private var typeValue: InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd? =
        null

    public var type: InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b {
      check(typeValue != null) { "type is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b must be a JSON object")
      val type = json.decodeRequired<InlineV1BillingPortalConfiab44PostRequestFormFeaturesTypeX15fbe3bd>(rawObject, "type")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b = InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
