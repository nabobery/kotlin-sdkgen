package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/get-budget.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/get-budget
 */
@Serializable(with = GetBudget.Serializer::class)
public class GetBudget(
  public val budgetAlerting: InlineGetBudgetBudgetAlertingXd59be602,
  /**
   * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
   */
  public val budgetAmount: Int,
  /**
   * The name of the entity to apply the budget to
   */
  public val budgetEntityName: String,
  /**
   * A single product or sku to apply the budget to.
   */
  public val budgetProductSku: String,
  /**
   * The type of scope for the budget
   */
  public val budgetScope: InlineGetBudgetBudgetScopeXaa2ca9e6,
  /**
   * The type of pricing for the budget
   */
  public val budgetType: InlineGetBudgetBudgetTypeXe27d187b,
  /**
   * ID of the budget.
   */
  public val id: String,
  /**
   * Whether to prevent additional spending once the budget is exceeded
   */
  public val preventFurtherUsage: Boolean,
  /**
   * The user login when the budget is scoped to a single user (`user` scope).
   */
  public val user: String? = null,
) {
  public class Builder {
    private var budgetAlertingValue: InlineGetBudgetBudgetAlertingXd59be602? = null

    public var budgetAlerting: InlineGetBudgetBudgetAlertingXd59be602
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

    private var budgetEntityNameValue: String? = null

    public var budgetEntityName: String
      get() = requireNotNull(budgetEntityNameValue) { "budgetEntityName is required" }
      set(`value`) {
        budgetEntityNameValue = value
      }

    private var budgetProductSkuValue: String? = null

    public var budgetProductSku: String
      get() = requireNotNull(budgetProductSkuValue) { "budgetProductSku is required" }
      set(`value`) {
        budgetProductSkuValue = value
      }

    private var budgetScopeValue: InlineGetBudgetBudgetScopeXaa2ca9e6? = null

    public var budgetScope: InlineGetBudgetBudgetScopeXaa2ca9e6
      get() = requireNotNull(budgetScopeValue) { "budgetScope is required" }
      set(`value`) {
        budgetScopeValue = value
      }

    private var budgetTypeValue: InlineGetBudgetBudgetTypeXe27d187b? = null

    public var budgetType: InlineGetBudgetBudgetTypeXe27d187b
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
     * The user login when the budget is scoped to a single user (`user` scope).
     */
    public var user: String? = null

    public fun build(): GetBudget {
      check(budgetAlertingValue != null) { "budgetAlerting is required" }
      check(budgetAmountValue != null) { "budgetAmount is required" }
      check(budgetEntityNameValue != null) { "budgetEntityName is required" }
      check(budgetProductSkuValue != null) { "budgetProductSku is required" }
      check(budgetScopeValue != null) { "budgetScope is required" }
      check(budgetTypeValue != null) { "budgetType is required" }
      check(idValue != null) { "id is required" }
      check(preventFurtherUsageValue != null) { "preventFurtherUsage is required" }
      return GetBudget(
        budgetAlerting = budgetAlerting,
        budgetAmount = budgetAmount,
        budgetEntityName = budgetEntityName,
        budgetProductSku = budgetProductSku,
        budgetScope = budgetScope,
        budgetType = budgetType,
        id = id,
        preventFurtherUsage = preventFurtherUsage,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetBudget = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GetBudget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetBudget {
      val jsonDecoder = decoder.requireJsonDecoder("GetBudget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetBudget must be a JSON object")
      val budgetAlerting = json.decodeRequired<InlineGetBudgetBudgetAlertingXd59be602>(rawObject, "budget_alerting")
      val budgetAmount = json.decodeRequired<Int>(rawObject, "budget_amount")
      val budgetEntityName = json.decodeRequired<String>(rawObject, "budget_entity_name")
      val budgetProductSku = json.decodeRequired<String>(rawObject, "budget_product_sku")
      val budgetScope = json.decodeRequired<InlineGetBudgetBudgetScopeXaa2ca9e6>(rawObject, "budget_scope")
      val budgetType = json.decodeRequired<InlineGetBudgetBudgetTypeXe27d187b>(rawObject, "budget_type")
      val id = json.decodeRequired<String>(rawObject, "id")
      val preventFurtherUsage = json.decodeRequired<Boolean>(rawObject, "prevent_further_usage")
      return GetBudget(
        budgetAlerting = budgetAlerting,
        budgetAmount = budgetAmount,
        budgetEntityName = budgetEntityName,
        budgetProductSku = budgetProductSku,
        budgetScope = budgetScope,
        budgetType = budgetType,
        id = id,
        preventFurtherUsage = preventFurtherUsage,
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetBudget) {
      val jsonEncoder = encoder.requireJsonEncoder("GetBudget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("budget_alerting", json.encodeToJsonElement(value.budgetAlerting))
        put("budget_amount", json.encodeToJsonElement(value.budgetAmount))
        put("budget_entity_name", value.budgetEntityName)
        put("budget_product_sku", value.budgetProductSku)
        put("budget_scope", json.encodeToJsonElement(value.budgetScope))
        put("budget_type", json.encodeToJsonElement(value.budgetType))
        put("id", value.id)
        put("prevent_further_usage", json.encodeToJsonElement(value.preventFurtherUsage))
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getBudget(block: GetBudget.Builder.() -> Unit): GetBudget = GetBudget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetBudget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
