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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/create-budget.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/create-budget
 */
@Serializable(with = CreateBudget.Serializer::class)
public class CreateBudget(
  public val budget: InlineCreateBudgetBudgetX11b5e089,
  /**
   * A message indicating the result of the create operation
   */
  public val message: String,
) {
  public class Builder {
    private var budgetValue: InlineCreateBudgetBudgetX11b5e089? = null

    public var budget: InlineCreateBudgetBudgetX11b5e089
      get() = requireNotNull(budgetValue) { "budget is required" }
      set(`value`) {
        budgetValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): CreateBudget {
      check(budgetValue != null) { "budget is required" }
      check(messageValue != null) { "message is required" }
      return CreateBudget(
        budget = budget,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateBudget = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateBudget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateBudget {
      val jsonDecoder = decoder.requireJsonDecoder("CreateBudget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateBudget must be a JSON object")
      val budget = json.decodeRequired<InlineCreateBudgetBudgetX11b5e089>(rawObject, "budget")
      val message = json.decodeRequired<String>(rawObject, "message")
      return CreateBudget(
        budget = budget,
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateBudget) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateBudget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("budget", json.encodeToJsonElement(value.budget))
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createBudget(block: CreateBudget.Builder.() -> Unit): CreateBudget = CreateBudget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateBudget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
