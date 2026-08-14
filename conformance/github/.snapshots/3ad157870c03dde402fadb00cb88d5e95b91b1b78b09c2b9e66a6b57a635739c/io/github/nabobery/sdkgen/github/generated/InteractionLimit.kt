package io.github.nabobery.sdkgen.github.generated

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
 * Limit interactions to a specific type of user for a specified duration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/interaction-limit
 */
@Serializable(with = InteractionLimit.Serializer::class)
public class InteractionLimit(
  public val limit: InteractionGroup,
  public val expiry: InteractionExpiry? = null,
) {
  public class Builder {
    private var limitValue: InteractionGroup? = null

    public var limit: InteractionGroup
      get() = requireNotNull(limitValue) { "limit is required" }
      set(`value`) {
        limitValue = value
      }

    public var expiry: InteractionExpiry? = null

    public fun build(): InteractionLimit {
      check(limitValue != null) { "limit is required" }
      return InteractionLimit(
        limit = limit,
        expiry = expiry,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InteractionLimit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InteractionLimit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InteractionLimit {
      val jsonDecoder = decoder.requireJsonDecoder("InteractionLimit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InteractionLimit must be a JSON object")
      val limit = json.decodeRequired<InteractionGroup>(rawObject, "limit")
      return InteractionLimit(
        limit = limit,
        expiry = rawObject["expiry"]?.let { json.decodeFromJsonElement<InteractionExpiry>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InteractionLimit) {
      val jsonEncoder = encoder.requireJsonEncoder("InteractionLimit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("limit", json.encodeToJsonElement(value.limit))
        value.expiry?.let { put("expiry", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun interactionLimit(block: InteractionLimit.Builder.() -> Unit): InteractionLimit = InteractionLimit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InteractionLimit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
