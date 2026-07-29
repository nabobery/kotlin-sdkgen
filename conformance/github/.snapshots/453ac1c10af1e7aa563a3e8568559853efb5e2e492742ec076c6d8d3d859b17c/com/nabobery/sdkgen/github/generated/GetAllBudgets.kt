package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/get_all_budgets.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/get_all_budgets
 */
@Serializable(with = GetAllBudgets.Serializer::class)
public class GetAllBudgets(
  budgets: List<Budget>,
  /**
   * Effective user-level budget details returned when the response is scoped with the `user` query parameter.
   */
  public val effectiveBudget: InlineGetAllBudgetsEffectiveBudgetX347cff79? = null,
  /**
   * Indicates if there are more pages of results available (maps to hasNextPage from billing platform)
   */
  public val hasNextPage: Boolean? = null,
  /**
   * Total number of budgets matching the query
   */
  public val totalCount: Int? = null,
  /**
   * User login included when the response is scoped with the `user` query parameter.
   */
  public val user: String? = null,
) {
  /**
   * Array of budget objects for the enterprise
   */
  public val budgets: List<Budget> = budgets.toList()

  public class Builder {
    private var budgetsValue: List<Budget>? = null

    public var budgets: List<Budget>
      get() = requireNotNull(budgetsValue) { "budgets is required" }.toList()
      set(`value`) {
        budgetsValue = value.toList()
      }

    /**
     * Effective user-level budget details returned when the response is scoped with the `user` query parameter.
     */
    public var effectiveBudget: InlineGetAllBudgetsEffectiveBudgetX347cff79? = null

    /**
     * Indicates if there are more pages of results available (maps to hasNextPage from billing platform)
     */
    public var hasNextPage: Boolean? = null

    /**
     * Total number of budgets matching the query
     */
    public var totalCount: Int? = null

    /**
     * User login included when the response is scoped with the `user` query parameter.
     */
    public var user: String? = null

    public fun build(): GetAllBudgets {
      check(budgetsValue != null) { "budgets is required" }
      return GetAllBudgets(
        budgets = budgets,
        effectiveBudget = effectiveBudget,
        hasNextPage = hasNextPage,
        totalCount = totalCount,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetAllBudgets = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GetAllBudgets> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetAllBudgets {
      val jsonDecoder = decoder.requireJsonDecoder("GetAllBudgets")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetAllBudgets must be a JSON object")
      val budgets = json.decodeRequired<List<Budget>>(rawObject, "budgets")
      return GetAllBudgets(
        budgets = budgets,
        effectiveBudget = rawObject["effective_budget"]?.let { json.decodeFromJsonElement<InlineGetAllBudgetsEffectiveBudgetX347cff79>(it) },
        hasNextPage = rawObject["has_next_page"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetAllBudgets) {
      val jsonEncoder = encoder.requireJsonEncoder("GetAllBudgets")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("budgets", json.encodeToJsonElement(value.budgets))
        value.effectiveBudget?.let { put("effective_budget", json.encodeToJsonElement(it)) }
        value.hasNextPage?.let { put("has_next_page", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getAllBudgets(block: GetAllBudgets.Builder.() -> Unit): GetAllBudgets = GetAllBudgets.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetAllBudgets is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
