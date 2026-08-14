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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0.Serializer::class)
public class InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0(
  public val content: InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e,
  public val role: InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b,
  public val phase: InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a? = null,
  public val type: InlineBaseInputsAnyOf2ItemAnyOf1TypeX6d3b39ba? = null,
) {
  public class Builder {
    private var contentValue: InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e? = null

    public var content: InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b? = null

    public var role: InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public var phase: InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a? = null

    public var type: InlineBaseInputsAnyOf2ItemAnyOf1TypeX6d3b39ba? = null

    public fun build(): InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      return InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0(
        content = content,
        role = role,
        phase = phase,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 must be a JSON object")
      val content = json.decodeRequired<InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e>(rawObject, "content")
      val role = json.decodeRequired<InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b>(rawObject, "role")
      return InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0(
        content = content,
        role = role,
        phase = rawObject["phase"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1TypeX6d3b39ba>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("role", json.encodeToJsonElement(value.role))
        value.phase?.let { put("phase", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBaseInputsAnyOf2ItemAnyOf1X4de472a0(block: InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0.Builder.() -> Unit): InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 = InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBaseInputsAnyOf2ItemAnyOf1X4de472a0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
