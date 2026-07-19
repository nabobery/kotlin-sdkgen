package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * /oneOf/0.
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5
  .Serializer::class)
public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5(
  public val exitCode: Int,
  public val type:
      InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8,
) {
  public class Builder {
    private var exitCodeValue: Int? = null

    public var exitCode: Int
      get() = requireNotNull(exitCodeValue) { "exitCode is required" }
      set(`value`) {
        exitCodeValue = value
      }

    private var typeValue:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8? =
        null

    public var type:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 {
      check(exitCodeValue != null) { "exitCode is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5(
        exitCode = exitCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 " +
          "must be a JSON object")
      val exitCode = json.decodeRequired<Int>(raw, "exit_code")
      val type = json
        .decodeRequired<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8>(raw,
          "type")
      return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5(
        exitCode = exitCode,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("exit_code", json.encodeToJsonElement(value.exitCode))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5(block: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5.Builder.() -> Unit): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
