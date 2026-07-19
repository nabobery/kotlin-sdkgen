package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Current API key information
 */
@Serializable(with = InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData.Serializer::class)
public class InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData internal constructor(
  /**
   * Total external BYOK usage (in USD) for the API key
   */
  public val byokUsage: Double,
  /**
   * External BYOK usage (in USD) for the current UTC day
   */
  public val byokUsageDaily: Double,
  /**
   * External BYOK usage (in USD) for current UTC month
   */
  public val byokUsageMonthly: Double,
  /**
   * External BYOK usage (in USD) for the current UTC week (Monday-Sunday)
   */
  public val byokUsageWeekly: Double,
  /**
   * The user ID of the key creator. For organization-owned keys, this is the member who created the key. For individual
   * users, this is the user's own ID.
   */
  public val creatorUserId: String?,
  /**
   * Whether to include external BYOK usage in the credit limit
   */
  public val includeByokInLimit: Boolean,
  /**
   * Whether this is a free tier API key
   */
  public val isFreeTier: Boolean,
  /**
   * Whether this is a management key
   */
  public val isManagementKey: Boolean,
  /**
   * Whether this is a management key
   */
  public val isProvisioningKey: Boolean,
  /**
   * Human-readable label for the API key
   */
  public val label: String,
  /**
   * Spending limit for the API key in USD
   */
  public val limit: Double?,
  /**
   * Remaining spending limit in USD
   */
  public val limitRemaining: Double?,
  /**
   * Type of limit reset for the API key
   */
  public val limitReset: String?,
  /**
   * Legacy rate limit information about a key. Will always return -1.
   */
  public val rateLimit:
      InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit,
  /**
   * Total OpenRouter credit usage (in USD) for the API key
   */
  public val usage: Double,
  /**
   * OpenRouter credit usage (in USD) for the current UTC day
   */
  public val usageDaily: Double,
  /**
   * OpenRouter credit usage (in USD) for the current UTC month
   */
  public val usageMonthly: Double,
  /**
   * OpenRouter credit usage (in USD) for the current UTC week (Monday-Sunday)
   */
  public val usageWeekly: Double,
  private val expiresAtState: FieldState<String?>,
) {
  /**
   * ISO 8601 UTC timestamp when the API key expires, or null if no expiration
   */
  public val expiresAt: String?
    get() = expiresAtState.valueOrNull()

  public constructor(
    byokUsage: Double,
    byokUsageDaily: Double,
    byokUsageMonthly: Double,
    byokUsageWeekly: Double,
    creatorUserId: String?,
    includeByokInLimit: Boolean,
    isFreeTier: Boolean,
    isManagementKey: Boolean,
    isProvisioningKey: Boolean,
    label: String,
    limit: Double?,
    limitRemaining: Double?,
    limitReset: String?,
    rateLimit: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit,
    usage: Double,
    usageDaily: Double,
    usageMonthly: Double,
    usageWeekly: Double,
  ) : this(byokUsage = byokUsage,
  byokUsageDaily = byokUsageDaily,
  byokUsageMonthly = byokUsageMonthly,
  byokUsageWeekly = byokUsageWeekly,
  creatorUserId = creatorUserId,
  includeByokInLimit = includeByokInLimit,
  isFreeTier = isFreeTier,
  isManagementKey = isManagementKey,
  isProvisioningKey = isProvisioningKey,
  label = label,
  limit = limit,
  limitRemaining = limitRemaining,
  limitReset = limitReset,
  rateLimit = rateLimit,
  usage = usage,
  usageDaily = usageDaily,
  usageMonthly = usageMonthly,
  usageWeekly = usageWeekly,
  expiresAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `expires_at`.
   */
  public fun expiresAtPresence(): FieldPresence = expiresAtState.presence

  public class Builder {
    private var byokUsageValue: Double? = null

    public var byokUsage: Double
      get() = requireNotNull(byokUsageValue) { "byokUsage is required" }
      set(`value`) {
        byokUsageValue = value
      }

    private var byokUsageDailyValue: Double? = null

    public var byokUsageDaily: Double
      get() = requireNotNull(byokUsageDailyValue) { "byokUsageDaily is required" }
      set(`value`) {
        byokUsageDailyValue = value
      }

    private var byokUsageMonthlyValue: Double? = null

    public var byokUsageMonthly: Double
      get() = requireNotNull(byokUsageMonthlyValue) { "byokUsageMonthly is required" }
      set(`value`) {
        byokUsageMonthlyValue = value
      }

    private var byokUsageWeeklyValue: Double? = null

    public var byokUsageWeekly: Double
      get() = requireNotNull(byokUsageWeeklyValue) { "byokUsageWeekly is required" }
      set(`value`) {
        byokUsageWeeklyValue = value
      }

    private var includeByokInLimitValue: Boolean? = null

    public var includeByokInLimit: Boolean
      get() = requireNotNull(includeByokInLimitValue) { "includeByokInLimit is required" }
      set(`value`) {
        includeByokInLimitValue = value
      }

    private var isFreeTierValue: Boolean? = null

    public var isFreeTier: Boolean
      get() = requireNotNull(isFreeTierValue) { "isFreeTier is required" }
      set(`value`) {
        isFreeTierValue = value
      }

    private var isManagementKeyValue: Boolean? = null

    public var isManagementKey: Boolean
      get() = requireNotNull(isManagementKeyValue) { "isManagementKey is required" }
      set(`value`) {
        isManagementKeyValue = value
      }

    private var isProvisioningKeyValue: Boolean? = null

    public var isProvisioningKey: Boolean
      get() = requireNotNull(isProvisioningKeyValue) { "isProvisioningKey is required" }
      set(`value`) {
        isProvisioningKeyValue = value
      }

    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var rateLimitValue:
        InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit?
        = null

    public var rateLimit:
        InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit
      get() = requireNotNull(rateLimitValue) { "rateLimit is required" }
      set(`value`) {
        rateLimitValue = value
      }

    private var usageValue: Double? = null

    public var usage: Double
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

    private var usageDailyValue: Double? = null

    public var usageDaily: Double
      get() = requireNotNull(usageDailyValue) { "usageDaily is required" }
      set(`value`) {
        usageDailyValue = value
      }

    private var usageMonthlyValue: Double? = null

    public var usageMonthly: Double
      get() = requireNotNull(usageMonthlyValue) { "usageMonthly is required" }
      set(`value`) {
        usageMonthlyValue = value
      }

    private var usageWeeklyValue: Double? = null

    public var usageWeekly: Double
      get() = requireNotNull(usageWeeklyValue) { "usageWeekly is required" }
      set(`value`) {
        usageWeeklyValue = value
      }

    private var creatorUserIdState: FieldState<String?> = FieldState.Absent

    /**
     * The user ID of the key creator. For organization-owned keys, this is the member who created the key. For
     * individual users, this is the user's own ID.
     * Required nullable field; assigning `null` records present-null.
     */
    public var creatorUserId: String?
      get() = creatorUserIdState.valueOrNull()
      set(`value`) {
        creatorUserIdState = value.toNullableFieldState()
      }

    private var limitState: FieldState<Double?> = FieldState.Absent

    /**
     * Spending limit for the API key in USD
     * Required nullable field; assigning `null` records present-null.
     */
    public var limit: Double?
      get() = limitState.valueOrNull()
      set(`value`) {
        limitState = value.toNullableFieldState()
      }

    private var limitRemainingState: FieldState<Double?> = FieldState.Absent

    /**
     * Remaining spending limit in USD
     * Required nullable field; assigning `null` records present-null.
     */
    public var limitRemaining: Double?
      get() = limitRemainingState.valueOrNull()
      set(`value`) {
        limitRemainingState = value.toNullableFieldState()
      }

    private var limitResetState: FieldState<String?> = FieldState.Absent

    /**
     * Type of limit reset for the API key
     * Required nullable field; assigning `null` records present-null.
     */
    public var limitReset: String?
      get() = limitResetState.valueOrNull()
      set(`value`) {
        limitResetState = value.toNullableFieldState()
      }

    private var expiresAtState: FieldState<String?> = FieldState.Absent

    /**
     * ISO 8601 UTC timestamp when the API key expires, or null if no expiration
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var expiresAt: String?
      get() = expiresAtState.valueOrNull()
      set(`value`) {
        expiresAtState = value.toNullableFieldState()
      }

    /**
     * Omits `expires_at` from serialized output.
     */
    public fun unsetExpiresAt() {
      expiresAtState = FieldState.Absent
    }

    public fun build(): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData {
      check(byokUsageValue != null) { "byokUsage is required" }
      check(byokUsageDailyValue != null) { "byokUsageDaily is required" }
      check(byokUsageMonthlyValue != null) { "byokUsageMonthly is required" }
      check(byokUsageWeeklyValue != null) { "byokUsageWeekly is required" }
      check(includeByokInLimitValue != null) { "includeByokInLimit is required" }
      check(isFreeTierValue != null) { "isFreeTier is required" }
      check(isManagementKeyValue != null) { "isManagementKey is required" }
      check(isProvisioningKeyValue != null) { "isProvisioningKey is required" }
      check(labelValue != null) { "label is required" }
      check(rateLimitValue != null) { "rateLimit is required" }
      check(usageValue != null) { "usage is required" }
      check(usageDailyValue != null) { "usageDaily is required" }
      check(usageMonthlyValue != null) { "usageMonthly is required" }
      check(usageWeeklyValue != null) { "usageWeekly is required" }
      check(creatorUserIdState !== FieldState.Absent) { "creatorUserId is required, even when null" }
      check(limitState !== FieldState.Absent) { "limit is required, even when null" }
      check(limitRemainingState !== FieldState.Absent) { "limitRemaining is required, even when null" }
      check(limitResetState !== FieldState.Absent) { "limitReset is required, even when null" }
      return InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData(
        byokUsage = byokUsage,
        byokUsageDaily = byokUsageDaily,
        byokUsageMonthly = byokUsageMonthly,
        byokUsageWeekly = byokUsageWeekly,
        creatorUserId = creatorUserIdState.valueOrNull(),
        includeByokInLimit = includeByokInLimit,
        isFreeTier = isFreeTier,
        isManagementKey = isManagementKey,
        isProvisioningKey = isProvisioningKey,
        label = label,
        limit = limitState.valueOrNull(),
        limitRemaining = limitRemainingState.valueOrNull(),
        limitReset = limitResetState.valueOrNull(),
        rateLimit = rateLimit,
        usage = usage,
        usageDaily = usageDaily,
        usageMonthly = usageMonthly,
        usageWeekly = usageWeekly,
        expiresAtState = expiresAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData must be " +
          "a JSON object")
      val byokUsage = json.decodeRequired<Double>(raw, "byok_usage")
      val byokUsageDaily = json.decodeRequired<Double>(raw, "byok_usage_daily")
      val byokUsageMonthly = json.decodeRequired<Double>(raw, "byok_usage_monthly")
      val byokUsageWeekly = json.decodeRequired<Double>(raw, "byok_usage_weekly")
      val includeByokInLimit = json.decodeRequired<Boolean>(raw, "include_byok_in_limit")
      val isFreeTier = json.decodeRequired<Boolean>(raw, "is_free_tier")
      val isManagementKey = json.decodeRequired<Boolean>(raw, "is_management_key")
      val isProvisioningKey = json.decodeRequired<Boolean>(raw, "is_provisioning_key")
      val label = json.decodeRequired<String>(raw, "label")
      val rateLimit = json
























































                                                                                                                        .decodeRequired<InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesDataPropertiesRateLimit>(raw, "rate_limit")
      val usage = json.decodeRequired<Double>(raw, "usage")
      val usageDaily = json.decodeRequired<Double>(raw, "usage_daily")
      val usageMonthly = json.decodeRequired<Double>(raw, "usage_monthly")
      val usageWeekly = json.decodeRequired<Double>(raw, "usage_weekly")
      if (!raw.containsKey("creator_user_id")) {
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData is " +
          "missing required property 'creator_user_id'")
      }
      val creatorUserId = raw["creator_user_id"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("limit")) {
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData is " +
          "missing required property 'limit'")
      }
      val limit = raw["limit"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!raw.containsKey("limit_remaining")) {
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData is " +
          "missing required property 'limit_remaining'")
      }
      val limitRemaining = raw["limit_remaining"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!raw.containsKey("limit_reset")) {
        throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData is " +
          "missing required property 'limit_reset'")
      }
      val limitReset = raw["limit_reset"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData(
        byokUsage = byokUsage,
        byokUsageDaily = byokUsageDaily,
        byokUsageMonthly = byokUsageMonthly,
        byokUsageWeekly = byokUsageWeekly,
        creatorUserId = creatorUserId,
        includeByokInLimit = includeByokInLimit,
        isFreeTier = isFreeTier,
        isManagementKey = isManagementKey,
        isProvisioningKey = isProvisioningKey,
        label = label,
        limit = limit,
        limitRemaining = limitRemaining,
        limitReset = limitReset,
        rateLimit = rateLimit,
        usage = usage,
        usageDaily = usageDaily,
        usageMonthly = usageMonthly,
        usageWeekly = usageWeekly,
        expiresAtState = json.decodeOptional(raw, "expires_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("byok_usage", json.encodeToJsonElement(value.byokUsage))
        put("byok_usage_daily", json.encodeToJsonElement(value.byokUsageDaily))
        put("byok_usage_monthly", json.encodeToJsonElement(value.byokUsageMonthly))
        put("byok_usage_weekly", json.encodeToJsonElement(value.byokUsageWeekly))
        put("creator_user_id", value.creatorUserId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("include_byok_in_limit", json.encodeToJsonElement(value.includeByokInLimit))
        put("is_free_tier", json.encodeToJsonElement(value.isFreeTier))
        put("is_management_key", json.encodeToJsonElement(value.isManagementKey))
        put("is_provisioning_key", json.encodeToJsonElement(value.isProvisioningKey))
        put("label", value.label)
        put("limit", value.limit?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("limit_remaining", value.limitRemaining?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("limit_reset", value.limitReset?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("rate_limit", json.encodeToJsonElement(value.rateLimit))
        put("usage", json.encodeToJsonElement(value.usage))
        put("usage_daily", json.encodeToJsonElement(value.usageDaily))
        put("usage_monthly", json.encodeToJsonElement(value.usageMonthly))
        put("usage_weekly", json.encodeToJsonElement(value.usageWeekly))
        putState("expires_at", value.expiresAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData(block: InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData.Builder.() -> Unit): InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData = InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlinePathsKeyGetResponses200ContentApplicationJsonSchemaPropertiesData " +
      "property '" + name + "' is not nullable")
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
