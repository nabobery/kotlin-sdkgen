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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Task budget for an agentic turn. The model sees a countdown of remaining tokens and uses it to prioritize work and
 * wind down gracefully. Advisory — does not enforce a hard cap.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/task_budget
 */
@Serializable(with = InlineMessagesOutputConfigTaskBudgetXc667201a.Serializer::class)
public class InlineMessagesOutputConfigTaskBudgetXc667201a(
  public val total: Int,
  public val type: InlineMessagesOutputConfigTaskBudgetTypeXf7d60062,
  public val remaining: Int? = null,
) {
  public class Builder {
    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    private var typeValue: InlineMessagesOutputConfigTaskBudgetTypeXf7d60062? = null

    public var type: InlineMessagesOutputConfigTaskBudgetTypeXf7d60062
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var remaining: Int? = null

    public fun build(): InlineMessagesOutputConfigTaskBudgetXc667201a {
      check(totalValue != null) { "total is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesOutputConfigTaskBudgetXc667201a(
        total = total,
        type = type,
        remaining = remaining,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesOutputConfigTaskBudgetXc667201a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesOutputConfigTaskBudgetXc667201a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesOutputConfigTaskBudgetXc667201a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesOutputConfigTaskBudgetXc667201a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesOutputConfigTaskBudgetXc667201a must be a JSON object")
      val total = json.decodeRequired<Int>(rawObject, "total")
      val type = json.decodeRequired<InlineMessagesOutputConfigTaskBudgetTypeXf7d60062>(rawObject, "type")
      return InlineMessagesOutputConfigTaskBudgetXc667201a(
        total = total,
        type = type,
        remaining = rawObject["remaining"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesOutputConfigTaskBudgetXc667201a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesOutputConfigTaskBudgetXc667201a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total", json.encodeToJsonElement(value.total))
        put("type", json.encodeToJsonElement(value.type))
        value.remaining?.let { put("remaining", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesOutputConfigTaskBudgetXc667201a(block: InlineMessagesOutputConfigTaskBudgetXc667201a.Builder.() -> Unit): InlineMessagesOutputConfigTaskBudgetXc667201a = InlineMessagesOutputConfigTaskBudgetXc667201a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesOutputConfigTaskBudgetXc667201a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
