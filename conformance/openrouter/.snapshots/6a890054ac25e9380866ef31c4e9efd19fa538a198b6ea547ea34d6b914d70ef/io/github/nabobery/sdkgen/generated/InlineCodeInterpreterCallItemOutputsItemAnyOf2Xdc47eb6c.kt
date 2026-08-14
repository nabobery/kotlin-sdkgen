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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/1
 */
@Serializable(with = InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c.Serializer::class)
public class InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c(
  public val logs: String,
  public val type: InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662,
) {
  public class Builder {
    private var logsValue: String? = null

    public var logs: String
      get() = requireNotNull(logsValue) { "logs is required" }
      set(`value`) {
        logsValue = value
      }

    private var typeValue: InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662? = null

    public var type: InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c {
      check(logsValue != null) { "logs is required" }
      check(typeValue != null) { "type is required" }
      return InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c(
        logs = logs,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c must be a JSON object")
      val logs = json.decodeRequired<String>(rawObject, "logs")
      val type = json.decodeRequired<InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662>(rawObject, "type")
      return InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c(
        logs = logs,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("logs", value.logs)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c(block: InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c.Builder.() -> Unit): InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c = InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
