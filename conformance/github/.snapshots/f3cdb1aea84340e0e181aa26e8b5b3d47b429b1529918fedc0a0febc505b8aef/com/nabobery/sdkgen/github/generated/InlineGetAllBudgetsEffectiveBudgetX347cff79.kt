package com.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * Effective user-level budget details returned when the response is scoped with the `user` query parameter.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/get_all_budgets/properties/effective_budget
 */
@Serializable(with = InlineGetAllBudgetsEffectiveBudgetX347cff79.Serializer::class)
public class InlineGetAllBudgetsEffectiveBudgetX347cff79(
  /**
   * The budget amount for the effective budget.
   */
  public val budgetAmount: Int,
  /**
   * The consumed amount for the specified user within the effective budget.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val consumedAmount: Double,
  /**
   * The unique identifier of the effective budget.
   */
  public val id: String,
) {
  public class Builder {
    private var budgetAmountValue: Int? = null

    public var budgetAmount: Int
      get() = requireNotNull(budgetAmountValue) { "budgetAmount is required" }
      set(`value`) {
        budgetAmountValue = value
      }

    private var consumedAmountValue: Double? = null

    public var consumedAmount: Double
      get() = requireNotNull(consumedAmountValue) { "consumedAmount is required" }
      set(`value`) {
        consumedAmountValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): InlineGetAllBudgetsEffectiveBudgetX347cff79 {
      check(budgetAmountValue != null) { "budgetAmount is required" }
      check(consumedAmountValue != null) { "consumedAmount is required" }
      check(idValue != null) { "id is required" }
      return InlineGetAllBudgetsEffectiveBudgetX347cff79(
        budgetAmount = budgetAmount,
        consumedAmount = consumedAmount,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGetAllBudgetsEffectiveBudgetX347cff79 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGetAllBudgetsEffectiveBudgetX347cff79> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGetAllBudgetsEffectiveBudgetX347cff79 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGetAllBudgetsEffectiveBudgetX347cff79")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGetAllBudgetsEffectiveBudgetX347cff79 must be a JSON object")
      val budgetAmount = json.decodeRequired<Int>(rawObject, "budget_amount")
      val consumedAmount = json.decodeRequired<Double>(rawObject, "consumed_amount")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineGetAllBudgetsEffectiveBudgetX347cff79(
        budgetAmount = budgetAmount,
        consumedAmount = consumedAmount,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGetAllBudgetsEffectiveBudgetX347cff79) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGetAllBudgetsEffectiveBudgetX347cff79")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("budget_amount", json.encodeToJsonElement(value.budgetAmount))
        put("consumed_amount", json.encodeToJsonElement(value.consumedAmount))
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGetAllBudgetsEffectiveBudgetX347cff79(block: InlineGetAllBudgetsEffectiveBudgetX347cff79.Builder.() -> Unit): InlineGetAllBudgetsEffectiveBudgetX347cff79 = InlineGetAllBudgetsEffectiveBudgetX347cff79.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGetAllBudgetsEffectiveBudgetX347cff79 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
