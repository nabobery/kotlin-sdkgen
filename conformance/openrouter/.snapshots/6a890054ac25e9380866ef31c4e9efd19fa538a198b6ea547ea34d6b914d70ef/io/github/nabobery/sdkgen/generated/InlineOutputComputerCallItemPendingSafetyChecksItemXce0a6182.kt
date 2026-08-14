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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/pending_safety_checks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/pending_safety_checks/items
 */
@Serializable(with = InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182.Serializer::class)
public class InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182(
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

    public fun build(): InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182 {
      check(codeValue != null) { "code is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      return InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182(
        code = code,
        id = id,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182 must be a JSON object")
      val code = json.decodeRequired<String>(rawObject, "code")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182(
        code = code,
        id = id,
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182")
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

public fun inlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182(block: InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182.Builder.() -> Unit): InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182 = InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
