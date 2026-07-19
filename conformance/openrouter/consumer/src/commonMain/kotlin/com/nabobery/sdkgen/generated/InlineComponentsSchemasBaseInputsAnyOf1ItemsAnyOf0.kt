package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0.Serializer::class)
public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0(
  public val content: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent,
  public val role: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole,
  public val phase: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase? = null,
  public val type: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType? = null,
) {
  public class Builder {
    private var contentValue: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent? =
        null

    public var content: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole? = null

    public var role: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public var phase: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase? = null

    public var type: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType? = null

    public fun build(): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0(
        content = content,
        role = role,
        phase = phase,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 must be a JSON object")
      val content = json.decodeRequired<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent>(raw,
        "content")
      val role = json.decodeRequired<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole>(raw, "role")
      return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0(
        content = content,
        role = role,
        phase = raw["phase"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase?>(element) },
        type = raw["type"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0")
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

public fun inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0(block: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0
  .Builder.() -> Unit): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 =
    InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0 is missing required property '" +
      name + "'")
  return decodeFromJsonElement(element)
}
