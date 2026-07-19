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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/pending_safety_checks/items.
 */
@Serializable(with = InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems.Serializer::class)
public class InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems(
  public val code: String,
  public val id: String,
  public val message: String,
) {
  public class Builder {
    private var codeValue: String? = null

    public var code: String
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems {
      check(codeValue != null) { "code is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      return InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems(
        code = code,
        id = id,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems " +
          "must be a JSON object")
      val code = json.decodeRequired<String>(raw, "code")
      val id = json.decodeRequired<String>(raw, "id")
      val message = json.decodeRequired<String>(raw, "message")
      return InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems(
        code = code,
        id = id,
        message = message,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", value.code)
        put("id", value.id)
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems(block: InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems.Builder.() -> Unit): InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems = InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputComputerCallItemPropertiesPendingSafetyChecksItems is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
