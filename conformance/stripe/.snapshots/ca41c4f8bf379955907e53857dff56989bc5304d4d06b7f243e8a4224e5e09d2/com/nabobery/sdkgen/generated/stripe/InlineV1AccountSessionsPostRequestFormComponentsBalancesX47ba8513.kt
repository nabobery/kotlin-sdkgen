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
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/balances.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/balances
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513(
  public val enabled: Boolean,
  public val features:
      InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var features: InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af?
        = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513(block: InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513 = InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
