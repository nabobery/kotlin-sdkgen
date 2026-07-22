package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/hovercard/properties/contexts/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hovercard/properties/contexts/items
 */
@Serializable(with = InlineHovercardContextsItemXffe5ad49.Serializer::class)
public class InlineHovercardContextsItemXffe5ad49(
  public val message: String,
  public val octicon: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var octiconValue: String? = null

    public var octicon: String
      get() = requireNotNull(octiconValue) { "octicon is required" }
      set(`value`) {
        octiconValue = value
      }

    public fun build(): InlineHovercardContextsItemXffe5ad49 {
      check(messageValue != null) { "message is required" }
      check(octiconValue != null) { "octicon is required" }
      return InlineHovercardContextsItemXffe5ad49(
        message = message,
        octicon = octicon,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineHovercardContextsItemXffe5ad49 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineHovercardContextsItemXffe5ad49> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineHovercardContextsItemXffe5ad49 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineHovercardContextsItemXffe5ad49")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineHovercardContextsItemXffe5ad49 must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val octicon = json.decodeRequired<String>(rawObject, "octicon")
      return InlineHovercardContextsItemXffe5ad49(
        message = message,
        octicon = octicon,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineHovercardContextsItemXffe5ad49) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineHovercardContextsItemXffe5ad49")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        put("octicon", value.octicon)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineHovercardContextsItemXffe5ad49(block: InlineHovercardContextsItemXffe5ad49.Builder.() -> Unit): InlineHovercardContextsItemXffe5ad49 = InlineHovercardContextsItemXffe5ad49.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineHovercardContextsItemXffe5ad49 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
