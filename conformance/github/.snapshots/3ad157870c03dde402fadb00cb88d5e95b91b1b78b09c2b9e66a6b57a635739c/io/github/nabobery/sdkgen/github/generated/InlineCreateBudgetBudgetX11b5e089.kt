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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget
 */
@Serializable(with = InlineCreateBudgetBudgetX11b5e089.Serializer::class)
public class InlineCreateBudgetBudgetX11b5e089(
  public val budgetAlerting: InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab? = null,
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
  public val budgetScope: InlineCreateBudgetBudgetBudgetScopeX37173668? = null,
  /**
   * The type of pricing for the budget
   */
  public val budgetType: InlineCreateBudgetBudgetBudgetTypeXc2e5ba79? = null,
  /**
   * ID of the budget.
   */
  public val id: String? = null,
  /**
   * Whether to prevent additional spending once the budget is exceeded
   */
  public val preventFurtherUsage: Boolean? = null,
) {
  public class Builder {
    public var budgetAlerting: InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab? = null

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
    public var budgetScope: InlineCreateBudgetBudgetBudgetScopeX37173668? = null

    /**
     * The type of pricing for the budget
     */
    public var budgetType: InlineCreateBudgetBudgetBudgetTypeXc2e5ba79? = null

    /**
     * ID of the budget.
     */
    public var id: String? = null

    /**
     * Whether to prevent additional spending once the budget is exceeded
     */
    public var preventFurtherUsage: Boolean? = null

    public fun build(): InlineCreateBudgetBudgetX11b5e089 = InlineCreateBudgetBudgetX11b5e089(
      budgetAlerting = budgetAlerting,
      budgetAmount = budgetAmount,
      budgetEntityName = budgetEntityName,
      budgetProductSku = budgetProductSku,
      budgetScope = budgetScope,
      budgetType = budgetType,
      id = id,
      preventFurtherUsage = preventFurtherUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCreateBudgetBudgetX11b5e089 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCreateBudgetBudgetX11b5e089> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreateBudgetBudgetX11b5e089 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreateBudgetBudgetX11b5e089")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCreateBudgetBudgetX11b5e089 must be a JSON object")
      return InlineCreateBudgetBudgetX11b5e089(
        budgetAlerting = rawObject["budget_alerting"]?.let { json.decodeFromJsonElement<InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab>(it) },
        budgetAmount = rawObject["budget_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        budgetEntityName = rawObject["budget_entity_name"]?.let { json.decodeFromJsonElement<String>(it) },
        budgetProductSku = rawObject["budget_product_sku"]?.let { json.decodeFromJsonElement<String>(it) },
        budgetScope = rawObject["budget_scope"]?.let { json.decodeFromJsonElement<InlineCreateBudgetBudgetBudgetScopeX37173668>(it) },
        budgetType = rawObject["budget_type"]?.let { json.decodeFromJsonElement<InlineCreateBudgetBudgetBudgetTypeXc2e5ba79>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        preventFurtherUsage = rawObject["prevent_further_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreateBudgetBudgetX11b5e089) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCreateBudgetBudgetX11b5e089")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.budgetAlerting?.let { put("budget_alerting", json.encodeToJsonElement(it)) }
        value.budgetAmount?.let { put("budget_amount", json.encodeToJsonElement(it)) }
        value.budgetEntityName?.let { put("budget_entity_name", it) }
        value.budgetProductSku?.let { put("budget_product_sku", it) }
        value.budgetScope?.let { put("budget_scope", json.encodeToJsonElement(it)) }
        value.budgetType?.let { put("budget_type", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.preventFurtherUsage?.let { put("prevent_further_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCreateBudgetBudgetX11b5e089(block: InlineCreateBudgetBudgetX11b5e089.Builder.() -> Unit): InlineCreateBudgetBudgetX11b5e089 = InlineCreateBudgetBudgetX11b5e089.build(block)
