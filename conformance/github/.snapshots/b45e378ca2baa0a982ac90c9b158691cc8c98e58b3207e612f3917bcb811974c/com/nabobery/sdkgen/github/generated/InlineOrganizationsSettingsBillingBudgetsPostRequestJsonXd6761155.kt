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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155.Serializer::class)
public class InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155(
  public val budgetAlerting:
      InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f? = null,
  /**
   * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
   */
  public val budgetAmount: Int? = null,
  /**
   * The name of the entity to apply the budget to
   */
  public val budgetEntityName: String? = null,
  /**
   * A single product or SKU that will be covered in the budget
   */
  public val budgetProductSku: String? = null,
  /**
   * The scope of the budget for this organization.
   *
   * - `organization`: Apply the budget to the organization.
   * - `repository`: Apply the budget to a specific repository in the organization.
   * - `multi_user_customer`: Apply a universal budget to all users in the organization.
   * - `user`: Apply the budget to a single user in the organization.
   *
   * `user` and `multi_user_customer` scopes are only supported when
   * `budget_product_sku` is `ai_credits` or `premium_requests`.
   */
  public val budgetScope:
      InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e? = null,
  /**
   * The type of pricing model used by the budget. Determines how `budget_product_sku` is interpreted.
   *
   * - `BundlePricing`: Covers all AI credit SKUs. Set `budget_product_sku` to `ai_credits`.
   * - `ProductPricing`: Covers all SKUs that belong to a product. Set `budget_product_sku` to a product such as
   * `actions` or `packages`.
   * - `SkuPricing`: Covers a single, specific SKU. Set `budget_product_sku` to a SKU such as `actions_linux`.
   */
  public val budgetType:
      InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetTypeXad3cc32c? = null,
  /**
   * Whether to prevent additional spending once the budget is exceeded. For `user` and `multi_user_customer` scopes,
   * this must be `true`.
   */
  public val preventFurtherUsage: Boolean? = null,
  /**
   * The username of the user for `user` scope budgets. This field is required when `budget_scope` is `user`.
   */
  public val user: String? = null,
) {
  public class Builder {
    public var budgetAlerting:
        InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f? = null

    /**
     * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
     */
    public var budgetAmount: Int? = null

    /**
     * The name of the entity to apply the budget to
     */
    public var budgetEntityName: String? = null

    /**
     * A single product or SKU that will be covered in the budget
     */
    public var budgetProductSku: String? = null

    /**
     * The scope of the budget for this organization.
     *
     * - `organization`: Apply the budget to the organization.
     * - `repository`: Apply the budget to a specific repository in the organization.
     * - `multi_user_customer`: Apply a universal budget to all users in the organization.
     * - `user`: Apply the budget to a single user in the organization.
     *
     * `user` and `multi_user_customer` scopes are only supported when
     * `budget_product_sku` is `ai_credits` or `premium_requests`.
     */
    public var budgetScope:
        InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e? = null

    /**
     * The type of pricing model used by the budget. Determines how `budget_product_sku` is interpreted.
     *
     * - `BundlePricing`: Covers all AI credit SKUs. Set `budget_product_sku` to `ai_credits`.
     * - `ProductPricing`: Covers all SKUs that belong to a product. Set `budget_product_sku` to a product such as
     * `actions` or `packages`.
     * - `SkuPricing`: Covers a single, specific SKU. Set `budget_product_sku` to a SKU such as `actions_linux`.
     */
    public var budgetType:
        InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetTypeXad3cc32c? = null

    /**
     * Whether to prevent additional spending once the budget is exceeded. For `user` and `multi_user_customer` scopes,
     * this must be `true`.
     */
    public var preventFurtherUsage: Boolean? = null

    /**
     * The username of the user for `user` scope budgets. This field is required when `budget_scope` is `user`.
     */
    public var user: String? = null

    public fun build(): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155 = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155(
      budgetAlerting = budgetAlerting,
      budgetAmount = budgetAmount,
      budgetEntityName = budgetEntityName,
      budgetProductSku = budgetProductSku,
      budgetScope = budgetScope,
      budgetType = budgetType,
      preventFurtherUsage = preventFurtherUsage,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155 must be a JSON object")
      return InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155(
        budgetAlerting = rawObject["budget_alerting"]?.let { json.decodeFromJsonElement<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f>(it) },
        budgetAmount = rawObject["budget_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        budgetEntityName = rawObject["budget_entity_name"]?.let { json.decodeFromJsonElement<String>(it) },
        budgetProductSku = rawObject["budget_product_sku"]?.let { json.decodeFromJsonElement<String>(it) },
        budgetScope = rawObject["budget_scope"]?.let { json.decodeFromJsonElement<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e>(it) },
        budgetType = rawObject["budget_type"]?.let { json.decodeFromJsonElement<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetTypeXad3cc32c>(it) },
        preventFurtherUsage = rawObject["prevent_further_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.budgetAlerting?.let { put("budget_alerting", json.encodeToJsonElement(it)) }
        value.budgetAmount?.let { put("budget_amount", json.encodeToJsonElement(it)) }
        value.budgetEntityName?.let { put("budget_entity_name", it) }
        value.budgetProductSku?.let { put("budget_product_sku", it) }
        value.budgetScope?.let { put("budget_scope", json.encodeToJsonElement(it)) }
        value.budgetType?.let { put("budget_type", json.encodeToJsonElement(it)) }
        value.preventFurtherUsage?.let { put("prevent_further_usage", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155(block: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155.Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155 = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155.build(block)
