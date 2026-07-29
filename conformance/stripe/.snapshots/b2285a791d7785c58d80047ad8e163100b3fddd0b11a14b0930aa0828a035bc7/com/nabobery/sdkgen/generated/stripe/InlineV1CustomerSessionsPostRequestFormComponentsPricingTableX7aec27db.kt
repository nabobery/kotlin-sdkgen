package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/pricing_table.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/pricing_table
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db(block: InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db = InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
