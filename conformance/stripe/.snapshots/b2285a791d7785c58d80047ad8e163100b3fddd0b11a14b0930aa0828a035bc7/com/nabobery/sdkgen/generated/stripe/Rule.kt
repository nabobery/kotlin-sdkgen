package com.nabobery.sdkgen.generated.stripe

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

@Serializable
public data class RuleView(
  public val action: String,
  public val id: String,
  public val predicate: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/rule
 */
@Serializable(with = Rule.Serializer::class)
public class Rule(
  /**
   * The action taken on the payment.
   */
  public val action: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The predicate to evaluate the payment against.
   */
  public val predicate: String,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var predicateValue: String? = null

    public var predicate: String
      get() = requireNotNull(predicateValue) { "predicate is required" }
      set(`value`) {
        predicateValue = value
      }

    public fun build(): Rule {
      check(actionValue != null) { "action is required" }
      check(idValue != null) { "id is required" }
      check(predicateValue != null) { "predicate is required" }
      return Rule(
        action = action,
        id = id,
        predicate = predicate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Rule = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Rule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Rule {
      val jsonDecoder = decoder.requireJsonDecoder("Rule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Rule must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val id = json.decodeRequired<String>(rawObject, "id")
      val predicate = json.decodeRequired<String>(rawObject, "predicate")
      return Rule(
        action = action,
        id = id,
        predicate = predicate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Rule) {
      val jsonEncoder = encoder.requireJsonEncoder("Rule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("id", value.id)
        put("predicate", value.predicate)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rule(block: Rule.Builder.() -> Unit): Rule = Rule.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Rule is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
