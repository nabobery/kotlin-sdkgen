package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicContainer.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicContainer
 */
@Serializable(with = AnthropicContainer.Serializer::class)
public class AnthropicContainer(
  public val expiresAt: String,
  public val id: String,
) {
  public class Builder {
    private var expiresAtValue: String? = null

    public var expiresAt: String
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): AnthropicContainer {
      check(expiresAtValue != null) { "expiresAt is required" }
      check(idValue != null) { "id is required" }
      return AnthropicContainer(
        expiresAt = expiresAt,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicContainer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicContainer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicContainer {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicContainer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicContainer must be a JSON object")
      val expiresAt = json.decodeRequired<String>(rawObject, "expires_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      return AnthropicContainer(
        expiresAt = expiresAt,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicContainer) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicContainer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("expires_at", value.expiresAt)
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicContainer(block: AnthropicContainer.Builder.() -> Unit): AnthropicContainer = AnthropicContainer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicContainer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
