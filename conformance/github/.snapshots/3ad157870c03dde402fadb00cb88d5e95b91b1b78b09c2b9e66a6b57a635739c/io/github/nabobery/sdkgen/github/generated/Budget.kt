package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/budget.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/budget
 */
@Serializable(with = Budget.Serializer::class)
public class Budget(
  public val budgetAlerting: InlineBudgetBudgetAlertingX277ed818,
  /**
   * The budget amount limit in whole dollars. For license-based products, this represents the number of licenses.
   */
  public val budgetAmount: Int,
  /**
   * A single product or sku to apply the budget to.
   */
  public val budgetProductSku: String,
  /**
   * The scope of the budget
   */
  public val budgetScope: InlineBudgetBudgetScopeX2cf4761e,
  /**
   * The type of pricing for the budget
   */
  public val budgetType: InlineBudgetBudgetTypeXa13fa63f,
  /**
   * The unique identifier for the budget
   */
  public val id: String,
  /**
   * The type of limit enforcement for the budget
   */
  public val preventFurtherUsage: Boolean,
  /**
   * The name of the entity for the budget (enterprise does not require a name).
   */
  public val budgetEntityName: String? = null,
  /**
   * The user login when the budget is scoped to a single user (`user` scope).
   */
  public val user: String? = null,
) {
  public class Builder {
    private var budgetAlertingValue: InlineBudgetBudgetAlertingX277ed818? = null

    public var budgetAlerting: InlineBudgetBudgetAlertingX277ed818
      get() = requireNotNull(budgetAlertingValue) { "budgetAlerting is required" }
      set(`value`) {
        budgetAlertingValue = value
      }

    private var budgetAmountValue: Int? = null

    public var budgetAmount: Int
      get() = requireNotNull(budgetAmountValue) { "budgetAmount is required" }
      set(`value`) {
        budgetAmountValue = value
      }

    private var budgetProductSkuValue: String? = null

    public var budgetProductSku: String
      get() = requireNotNull(budgetProductSkuValue) { "budgetProductSku is required" }
      set(`value`) {
        budgetProductSkuValue = value
      }

    private var budgetScopeValue: InlineBudgetBudgetScopeX2cf4761e? = null

    public var budgetScope: InlineBudgetBudgetScopeX2cf4761e
      get() = requireNotNull(budgetScopeValue) { "budgetScope is required" }
      set(`value`) {
        budgetScopeValue = value
      }

    private var budgetTypeValue: InlineBudgetBudgetTypeXa13fa63f? = null

    public var budgetType: InlineBudgetBudgetTypeXa13fa63f
      get() = requireNotNull(budgetTypeValue) { "budgetType is required" }
      set(`value`) {
        budgetTypeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var preventFurtherUsageValue: Boolean? = null

    public var preventFurtherUsage: Boolean
      get() = requireNotNull(preventFurtherUsageValue) { "preventFurtherUsage is required" }
      set(`value`) {
        preventFurtherUsageValue = value
      }

    /**
     * The name of the entity for the budget (enterprise does not require a name).
     */
    public var budgetEntityName: String? = null

    /**
     * The user login when the budget is scoped to a single user (`user` scope).
     */
    public var user: String? = null

    public fun build(): Budget {
      check(budgetAlertingValue != null) { "budgetAlerting is required" }
      check(budgetAmountValue != null) { "budgetAmount is required" }
      check(budgetProductSkuValue != null) { "budgetProductSku is required" }
      check(budgetScopeValue != null) { "budgetScope is required" }
      check(budgetTypeValue != null) { "budgetType is required" }
      check(idValue != null) { "id is required" }
      check(preventFurtherUsageValue != null) { "preventFurtherUsage is required" }
      return Budget(
        budgetAlerting = budgetAlerting,
        budgetAmount = budgetAmount,
        budgetProductSku = budgetProductSku,
        budgetScope = budgetScope,
        budgetType = budgetType,
        id = id,
        preventFurtherUsage = preventFurtherUsage,
        budgetEntityName = budgetEntityName,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Budget = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Budget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Budget {
      val jsonDecoder = decoder.requireJsonDecoder("Budget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Budget must be a JSON object")
      val budgetAlerting = json.decodeRequired<InlineBudgetBudgetAlertingX277ed818>(rawObject, "budget_alerting")
      val budgetAmount = json.decodeRequired<Int>(rawObject, "budget_amount")
      val budgetProductSku = json.decodeRequired<String>(rawObject, "budget_product_sku")
      val budgetScope = json.decodeRequired<InlineBudgetBudgetScopeX2cf4761e>(rawObject, "budget_scope")
      val budgetType = json.decodeRequired<InlineBudgetBudgetTypeXa13fa63f>(rawObject, "budget_type")
      val id = json.decodeRequired<String>(rawObject, "id")
      val preventFurtherUsage = json.decodeRequired<Boolean>(rawObject, "prevent_further_usage")
      return Budget(
        budgetAlerting = budgetAlerting,
        budgetAmount = budgetAmount,
        budgetProductSku = budgetProductSku,
        budgetScope = budgetScope,
        budgetType = budgetType,
        id = id,
        preventFurtherUsage = preventFurtherUsage,
        budgetEntityName = rawObject["budget_entity_name"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Budget) {
      val jsonEncoder = encoder.requireJsonEncoder("Budget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("budget_alerting", json.encodeToJsonElement(value.budgetAlerting))
        put("budget_amount", json.encodeToJsonElement(value.budgetAmount))
        put("budget_product_sku", value.budgetProductSku)
        put("budget_scope", json.encodeToJsonElement(value.budgetScope))
        put("budget_type", json.encodeToJsonElement(value.budgetType))
        put("id", value.id)
        put("prevent_further_usage", json.encodeToJsonElement(value.preventFurtherUsage))
        value.budgetEntityName?.let { put("budget_entity_name", it) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun budget(block: Budget.Builder.() -> Unit): Budget = Budget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Budget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
