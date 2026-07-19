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
 */
@Serializable(with = InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget.Serializer::class)
public class InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget(
  public val total: Int,
  public val type: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType,
  public val remaining: Int? = null,
) {
  public class Builder {
    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType? = null

    public var type: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var remaining: Int? = null

    public fun build(): InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget {
      check(totalValue != null) { "total is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget(
        total = total,
        type = type,
        remaining = remaining,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget must be a JSON " +
          "object")
      val total = json.decodeRequired<Int>(raw, "total")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget(
        total = total,
        type = type,
        remaining = raw["remaining"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget")
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

public fun inlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget(block: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget.Builder.() -> Unit): InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget = InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
