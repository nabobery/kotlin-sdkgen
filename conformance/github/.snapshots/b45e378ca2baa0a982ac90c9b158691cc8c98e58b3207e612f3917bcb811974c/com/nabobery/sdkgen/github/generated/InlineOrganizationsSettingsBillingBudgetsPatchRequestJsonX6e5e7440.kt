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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440.Serializer::class)
public class InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 internal constructor(
  private val budgetAlertingState:
      FieldState<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893>,
  private val budgetAmountState: FieldState<Int>,
  private val budgetEntityNameState: FieldState<String>,
  private val budgetProductSkuState: FieldState<String>,
  private val budgetScopeState:
      FieldState<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed>,
  private val budgetTypeState:
      FieldState<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetTypeXf92b5b02>,
  private val preventFurtherUsageState: FieldState<Boolean>,
  private val userState: FieldState<String>,
) {
  public val budgetAlerting:
      InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893?
    get() = budgetAlertingState.valueOrNull()

  /**
   * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
   */
  public val budgetAmount: Int?
    get() = budgetAmountState.valueOrNull()

  /**
   * The name of the entity to apply the budget to
   */
  public val budgetEntityName: String?
    get() = budgetEntityNameState.valueOrNull()

  /**
   * A single product or SKU that will be covered in the budget
   */
  public val budgetProductSku: String?
    get() = budgetProductSkuState.valueOrNull()

  /**
   * The scope of the budget for this organization.
   *
   * - `organization`: Apply the budget to the organization.
   * - `repository`: Apply the budget to a specific repository in the organization.
   * - `multi_user_customer`: Apply a universal budget to all users in the organization.
   * - `user`: Apply the budget to a single user in the organization.
   */
  public val budgetScope:
      InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed?
    get() = budgetScopeState.valueOrNull()

  /**
   * The type of pricing model used by the budget. Determines how `budget_product_sku` is interpreted.
   *
   * - `BundlePricing`: Covers all AI credit SKUs. Set `budget_product_sku` to `ai_credits`.
   * - `ProductPricing`: Covers all SKUs that belong to a product. Set `budget_product_sku` to a product such as
   * `actions` or `packages`.
   * - `SkuPricing`: Covers a single, specific SKU. Set `budget_product_sku` to a SKU such as `actions_linux`.
   */
  public val budgetType:
      InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetTypeXf92b5b02?
    get() = budgetTypeState.valueOrNull()

  /**
   * Whether to prevent additional spending once the budget is exceeded. For budgets with `user` or
   * `multi_user_customer` scope, this must remain `true`.
   */
  public val preventFurtherUsage: Boolean?
    get() = preventFurtherUsageState.valueOrNull()

  /**
   * The username of the user for `user` scope budgets.
   */
  public val user: String?
    get() = userState.valueOrNull()

  public constructor() : this(budgetAlertingState = FieldState.Absent,
  budgetAmountState = FieldState.Absent,
  budgetEntityNameState = FieldState.Absent,
  budgetProductSkuState = FieldState.Absent,
  budgetScopeState = FieldState.Absent,
  budgetTypeState = FieldState.Absent,
  preventFurtherUsageState = FieldState.Absent,
  userState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `budget_alerting`.
   */
  public fun budgetAlertingPresence(): FieldPresence = budgetAlertingState.presence

  /**
   * Returns the wire presence of `budget_amount`.
   */
  public fun budgetAmountPresence(): FieldPresence = budgetAmountState.presence

  /**
   * Returns the wire presence of `budget_entity_name`.
   */
  public fun budgetEntityNamePresence(): FieldPresence = budgetEntityNameState.presence

  /**
   * Returns the wire presence of `budget_product_sku`.
   */
  public fun budgetProductSkuPresence(): FieldPresence = budgetProductSkuState.presence

  /**
   * Returns the wire presence of `budget_scope`.
   */
  public fun budgetScopePresence(): FieldPresence = budgetScopeState.presence

  /**
   * Returns the wire presence of `budget_type`.
   */
  public fun budgetTypePresence(): FieldPresence = budgetTypeState.presence

  /**
   * Returns the wire presence of `prevent_further_usage`.
   */
  public fun preventFurtherUsagePresence(): FieldPresence = preventFurtherUsageState.presence

  /**
   * Returns the wire presence of `user`.
   */
  public fun userPresence(): FieldPresence = userState.presence

  public class Builder {
    private var budgetAlertingState:
        FieldState<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893>
        = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var budgetAlerting:
        InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893?
      get() = budgetAlertingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "budgetAlerting is not nullable; call unsetBudgetAlerting() to omit it" }
        budgetAlertingState = FieldState.Value(present)
      }

    private var budgetAmountState: FieldState<Int> = FieldState.Absent

    /**
     * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var budgetAmount: Int?
      get() = budgetAmountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "budgetAmount is not nullable; call unsetBudgetAmount() to omit it" }
        budgetAmountState = FieldState.Value(present)
      }

    private var budgetEntityNameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the entity to apply the budget to
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var budgetEntityName: String?
      get() = budgetEntityNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "budgetEntityName is not nullable; call unsetBudgetEntityName() to omit it" }
        budgetEntityNameState = FieldState.Value(present)
      }

    private var budgetProductSkuState: FieldState<String> = FieldState.Absent

    /**
     * A single product or SKU that will be covered in the budget
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var budgetProductSku: String?
      get() = budgetProductSkuState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "budgetProductSku is not nullable; call unsetBudgetProductSku() to omit it" }
        budgetProductSkuState = FieldState.Value(present)
      }

    private var budgetScopeState:
        FieldState<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed> =
        FieldState.Absent

    /**
     * The scope of the budget for this organization.
     *
     * - `organization`: Apply the budget to the organization.
     * - `repository`: Apply the budget to a specific repository in the organization.
     * - `multi_user_customer`: Apply a universal budget to all users in the organization.
     * - `user`: Apply the budget to a single user in the organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var budgetScope:
        InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed?
      get() = budgetScopeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "budgetScope is not nullable; call unsetBudgetScope() to omit it" }
        budgetScopeState = FieldState.Value(present)
      }

    private var budgetTypeState:
        FieldState<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetTypeXf92b5b02> =
        FieldState.Absent

    /**
     * The type of pricing model used by the budget. Determines how `budget_product_sku` is interpreted.
     *
     * - `BundlePricing`: Covers all AI credit SKUs. Set `budget_product_sku` to `ai_credits`.
     * - `ProductPricing`: Covers all SKUs that belong to a product. Set `budget_product_sku` to a product such as
     * `actions` or `packages`.
     * - `SkuPricing`: Covers a single, specific SKU. Set `budget_product_sku` to a SKU such as `actions_linux`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var budgetType:
        InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetTypeXf92b5b02?
      get() = budgetTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "budgetType is not nullable; call unsetBudgetType() to omit it" }
        budgetTypeState = FieldState.Value(present)
      }

    private var preventFurtherUsageState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to prevent additional spending once the budget is exceeded. For budgets with `user` or
     * `multi_user_customer` scope, this must remain `true`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var preventFurtherUsage: Boolean?
      get() = preventFurtherUsageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "preventFurtherUsage is not nullable; call unsetPreventFurtherUsage() to omit it" }
        preventFurtherUsageState = FieldState.Value(present)
      }

    private var userState: FieldState<String> = FieldState.Absent

    /**
     * The username of the user for `user` scope budgets.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var user: String?
      get() = userState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "user is not nullable; call unsetUser() to omit it" }
        userState = FieldState.Value(present)
      }

    /**
     * Omits `budget_alerting` from serialized output.
     */
    public fun unsetBudgetAlerting() {
      budgetAlertingState = FieldState.Absent
    }

    /**
     * Omits `budget_amount` from serialized output.
     */
    public fun unsetBudgetAmount() {
      budgetAmountState = FieldState.Absent
    }

    /**
     * Omits `budget_entity_name` from serialized output.
     */
    public fun unsetBudgetEntityName() {
      budgetEntityNameState = FieldState.Absent
    }

    /**
     * Omits `budget_product_sku` from serialized output.
     */
    public fun unsetBudgetProductSku() {
      budgetProductSkuState = FieldState.Absent
    }

    /**
     * Omits `budget_scope` from serialized output.
     */
    public fun unsetBudgetScope() {
      budgetScopeState = FieldState.Absent
    }

    /**
     * Omits `budget_type` from serialized output.
     */
    public fun unsetBudgetType() {
      budgetTypeState = FieldState.Absent
    }

    /**
     * Omits `prevent_further_usage` from serialized output.
     */
    public fun unsetPreventFurtherUsage() {
      preventFurtherUsageState = FieldState.Absent
    }

    /**
     * Omits `user` from serialized output.
     */
    public fun unsetUser() {
      userState = FieldState.Absent
    }

    public fun build(): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440(
      budgetAlertingState = budgetAlertingState,
      budgetAmountState = budgetAmountState,
      budgetEntityNameState = budgetEntityNameState,
      budgetProductSkuState = budgetProductSkuState,
      budgetScopeState = budgetScopeState,
      budgetTypeState = budgetTypeState,
      preventFurtherUsageState = preventFurtherUsageState,
      userState = userState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 must be a JSON object")
      return InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440(
        budgetAlertingState = json.decodeOptional(rawObject, "budget_alerting", nullable = false),
        budgetAmountState = json.decodeOptional(rawObject, "budget_amount", nullable = false),
        budgetEntityNameState = json.decodeOptional(rawObject, "budget_entity_name", nullable = false),
        budgetProductSkuState = json.decodeOptional(rawObject, "budget_product_sku", nullable = false),
        budgetScopeState = json.decodeOptional(rawObject, "budget_scope", nullable = false),
        budgetTypeState = json.decodeOptional(rawObject, "budget_type", nullable = false),
        preventFurtherUsageState = json.decodeOptional(rawObject, "prevent_further_usage", nullable = false),
        userState = json.decodeOptional(rawObject, "user", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("budget_alerting", value.budgetAlertingState, json::encodeToJsonElement)
        putState("budget_amount", value.budgetAmountState, json::encodeToJsonElement)
        putState("budget_entity_name", value.budgetEntityNameState, json::encodeToJsonElement)
        putState("budget_product_sku", value.budgetProductSkuState, json::encodeToJsonElement)
        putState("budget_scope", value.budgetScopeState, json::encodeToJsonElement)
        putState("budget_type", value.budgetTypeState, json::encodeToJsonElement)
        putState("prevent_further_usage", value.preventFurtherUsageState, json::encodeToJsonElement)
        putState("user", value.userState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440(block: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440.Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
