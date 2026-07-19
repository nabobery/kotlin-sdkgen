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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/1.
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db
  .Serializer::class)
public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db(
  public val type:
      InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234? =
        null

    public var type:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db " +
          "must be a JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234>(raw,
          "type")
      return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db(block: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db.Builder.() -> Unit): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
