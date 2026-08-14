package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget
 */
@Serializable(with = InlineUpdateBudgetBudgetXf7a0c5f0.Serializer::class)
public class InlineUpdateBudgetBudgetXf7a0c5f0(
  public val budgetAlerting: InlineUpdateBudgetBudgetBudgetAlertingXca158659? = null,
  /**
   * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
   */
  public val budgetAmount: Int? = null,
  /**
   * The name of the entity to apply the budget to
   */
  public val budgetEntityName: String? = null,
  /**
   * A single product or sku to apply the budget to.
   */
  public val budgetProductSku: String? = null,
  /**
   * The type of scope for the budget
   */
  public val budgetScope: InlineUpdateBudgetBudgetBudgetScopeX11811775? = null,
  /**
   * The type of pricing for the budget
   */
  public val budgetType: InlineUpdateBudgetBudgetBudgetTypeXf471ce28? = null,
  /**
   * The consumed amount for the specified user within the budget. Only included for `user`-scoped budgets.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val consumedAmount: Double? = null,
  /**
   * ID of the budget.
   */
  public val id: String? = null,
  /**
   * Whether to prevent additional spending once the budget is exceeded
   */
  public val preventFurtherUsage: Boolean? = null,
  /**
   * The user login when the budget is scoped to a single user (`user` scope).
   */
  public val user: String? = null,
) {
  public class Builder {
    public var budgetAlerting: InlineUpdateBudgetBudgetBudgetAlertingXca158659? = null

    /**
     * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
     */
    public var budgetAmount: Int? = null

    /**
     * The name of the entity to apply the budget to
     */
    public var budgetEntityName: String? = null

    /**
     * A single product or sku to apply the budget to.
     */
    public var budgetProductSku: String? = null

    /**
     * The type of scope for the budget
     */
    public var budgetScope: InlineUpdateBudgetBudgetBudgetScopeX11811775? = null

    /**
     * The type of pricing for the budget
     */
    public var budgetType: InlineUpdateBudgetBudgetBudgetTypeXf471ce28? = null

    /**
     * The consumed amount for the specified user within the budget. Only included for `user`-scoped budgets.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var consumedAmount: Double? = null

    /**
     * ID of the budget.
     */
    public var id: String? = null

    /**
     * Whether to prevent additional spending once the budget is exceeded
     */
    public var preventFurtherUsage: Boolean? = null

    /**
     * The user login when the budget is scoped to a single user (`user` scope).
     */
    public var user: String? = null

    public fun build(): InlineUpdateBudgetBudgetXf7a0c5f0 = InlineUpdateBudgetBudgetXf7a0c5f0(
      budgetAlerting = budgetAlerting,
      budgetAmount = budgetAmount,
      budgetEntityName = budgetEntityName,
      budgetProductSku = budgetProductSku,
      budgetScope = budgetScope,
      budgetType = budgetType,
      consumedAmount = consumedAmount,
      id = id,
      preventFurtherUsage = preventFurtherUsage,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUpdateBudgetBudgetXf7a0c5f0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUpdateBudgetBudgetXf7a0c5f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUpdateBudgetBudgetXf7a0c5f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUpdateBudgetBudgetXf7a0c5f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUpdateBudgetBudgetXf7a0c5f0 must be a JSON object")
      return InlineUpdateBudgetBudgetXf7a0c5f0(
        budgetAlerting = rawObject["budget_alerting"]?.let { json.decodeFromJsonElement<InlineUpdateBudgetBudgetBudgetAlertingXca158659>(it) },
        budgetAmount = rawObject["budget_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        budgetEntityName = rawObject["budget_entity_name"]?.let { json.decodeFromJsonElement<String>(it) },
        budgetProductSku = rawObject["budget_product_sku"]?.let { json.decodeFromJsonElement<String>(it) },
        budgetScope = rawObject["budget_scope"]?.let { json.decodeFromJsonElement<InlineUpdateBudgetBudgetBudgetScopeX11811775>(it) },
        budgetType = rawObject["budget_type"]?.let { json.decodeFromJsonElement<InlineUpdateBudgetBudgetBudgetTypeXf471ce28>(it) },
        consumedAmount = rawObject["consumed_amount"]?.let { json.decodeFromJsonElement<Double>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        preventFurtherUsage = rawObject["prevent_further_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUpdateBudgetBudgetXf7a0c5f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUpdateBudgetBudgetXf7a0c5f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.budgetAlerting?.let { put("budget_alerting", json.encodeToJsonElement(it)) }
        value.budgetAmount?.let { put("budget_amount", json.encodeToJsonElement(it)) }
        value.budgetEntityName?.let { put("budget_entity_name", it) }
        value.budgetProductSku?.let { put("budget_product_sku", it) }
        value.budgetScope?.let { put("budget_scope", json.encodeToJsonElement(it)) }
        value.budgetType?.let { put("budget_type", json.encodeToJsonElement(it)) }
        value.consumedAmount?.let { put("consumed_amount", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.preventFurtherUsage?.let { put("prevent_further_usage", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUpdateBudgetBudgetXf7a0c5f0(block: InlineUpdateBudgetBudgetXf7a0c5f0.Builder.() -> Unit): InlineUpdateBudgetBudgetXf7a0c5f0 = InlineUpdateBudgetBudgetXf7a0c5f0.build(block)
