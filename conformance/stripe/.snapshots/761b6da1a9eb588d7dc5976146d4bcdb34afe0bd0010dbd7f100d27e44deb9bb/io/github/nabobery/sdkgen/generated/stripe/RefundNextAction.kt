package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_next_action
 */
@Serializable(with = RefundNextAction.Serializer::class)
public class RefundNextAction(
  /**
   * Type of the next action to perform.
   */
  public val type: String,
  public val displayDetails: RefundNextActionDisplayDetails? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var displayDetails: RefundNextActionDisplayDetails? = null

    public fun build(): RefundNextAction {
      check(typeValue != null) { "type is required" }
      return RefundNextAction(
        type = type,
        displayDetails = displayDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefundNextAction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RefundNextAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefundNextAction {
      val jsonDecoder = decoder.requireJsonDecoder("RefundNextAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RefundNextAction must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return RefundNextAction(
        type = type,
        displayDetails = rawObject["display_details"]?.let { json.decodeFromJsonElement<RefundNextActionDisplayDetails>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefundNextAction) {
      val jsonEncoder = encoder.requireJsonEncoder("RefundNextAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.displayDetails?.let { put("display_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refundNextAction(block: RefundNextAction.Builder.() -> Unit): RefundNextAction = RefundNextAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RefundNextAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
