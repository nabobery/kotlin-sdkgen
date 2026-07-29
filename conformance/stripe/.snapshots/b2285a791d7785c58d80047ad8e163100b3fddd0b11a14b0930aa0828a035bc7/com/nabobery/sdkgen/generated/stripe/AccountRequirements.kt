package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_requirements
 */
@Serializable(with = AccountRequirements.Serializer::class)
public class AccountRequirements(
  alternatives: List<AccountRequirementsAlternative>? = null,
  /**
   * Date by which the fields in `currently_due` must be collected to keep the account enabled. These fields may disable
   * the account sooner if the next threshold is reached before they are collected.
   */
  public val currentDeadline: Int? = null,
  currentlyDue: List<String>? = null,
  /**
   * If the account is disabled, this enum describes why. [Learn more about handling verification
   * issues](https://docs.stripe.com/connect/handling-api-verification).
   */
  public val disabledReason: InlineAccountRequirementsDisabledReasonX6c89d1f6? = null,
  errors: List<AccountRequirementsError>? = null,
  eventuallyDue: List<String>? = null,
  pastDue: List<String>? = null,
  pendingVerification: List<String>? = null,
) {
  /**
   * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Many
   * alternatives can list the same `original_fields_due`, and any of these alternatives can serve as a pathway for
   * attempting to resolve the fields again. Re-providing `original_fields_due` also serves as a pathway for attempting
   * to resolve the fields again.
   */
  public val alternatives: List<AccountRequirementsAlternative>? =
      alternatives?.let { collection0 -> collection0.toList() }

  /**
   * Fields that need to be resolved to keep the account enabled. If not resolved by `current_deadline`, these fields
   * will appear in `past_due` as well, and the account is disabled.
   */
  public val currentlyDue: List<String>? = currentlyDue?.let { collection0 -> collection0.toList() }

  /**
   * Details about validation and verification failures for `due` requirements that must be resolved.
   */
  public val errors: List<AccountRequirementsError>? =
      errors?.let { collection0 -> collection0.toList() }

  /**
   * Fields you must collect when all thresholds are reached. As they become required, they appear in `currently_due` as
   * well, and `current_deadline` becomes set.
   */
  public val eventuallyDue: List<String>? =
      eventuallyDue?.let { collection0 -> collection0.toList() }

  /**
   * Fields that haven't been resolved by `current_deadline`. These fields need to be resolved to enable the account.
   */
  public val pastDue: List<String>? = pastDue?.let { collection0 -> collection0.toList() }

  /**
   * Fields that are being reviewed, or might become required depending on the results of a review. If the review fails,
   * these fields can move to `eventually_due`, `currently_due`, `past_due` or `alternatives`. Fields might appear in
   * `eventually_due`, `currently_due`, `past_due` or `alternatives` and in `pending_verification` if one verification
   * fails but another is still pending.
   */
  public val pendingVerification: List<String>? =
      pendingVerification?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var alternativesValue: List<AccountRequirementsAlternative>? = null

    /**
     * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Many
     * alternatives can list the same `original_fields_due`, and any of these alternatives can serve as a pathway for
     * attempting to resolve the fields again. Re-providing `original_fields_due` also serves as a pathway for
     * attempting to resolve the fields again.
     */
    public var alternatives: List<AccountRequirementsAlternative>?
      get() = alternativesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        alternativesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Date by which the fields in `currently_due` must be collected to keep the account enabled. These fields may
     * disable the account sooner if the next threshold is reached before they are collected.
     */
    public var currentDeadline: Int? = null

    private var currentlyDueValue: List<String>? = null

    /**
     * Fields that need to be resolved to keep the account enabled. If not resolved by `current_deadline`, these fields
     * will appear in `past_due` as well, and the account is disabled.
     */
    public var currentlyDue: List<String>?
      get() = currentlyDueValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        currentlyDueValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * If the account is disabled, this enum describes why. [Learn more about handling verification
     * issues](https://docs.stripe.com/connect/handling-api-verification).
     */
    public var disabledReason: InlineAccountRequirementsDisabledReasonX6c89d1f6? = null

    private var errorsValue: List<AccountRequirementsError>? = null

    /**
     * Details about validation and verification failures for `due` requirements that must be resolved.
     */
    public var errors: List<AccountRequirementsError>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var eventuallyDueValue: List<String>? = null

    /**
     * Fields you must collect when all thresholds are reached. As they become required, they appear in `currently_due`
     * as well, and `current_deadline` becomes set.
     */
    public var eventuallyDue: List<String>?
      get() = eventuallyDueValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        eventuallyDueValue = value?.let { collection0 -> collection0.toList() }
      }

    private var pastDueValue: List<String>? = null

    /**
     * Fields that haven't been resolved by `current_deadline`. These fields need to be resolved to enable the account.
     */
    public var pastDue: List<String>?
      get() = pastDueValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pastDueValue = value?.let { collection0 -> collection0.toList() }
      }

    private var pendingVerificationValue: List<String>? = null

    /**
     * Fields that are being reviewed, or might become required depending on the results of a review. If the review
     * fails, these fields can move to `eventually_due`, `currently_due`, `past_due` or `alternatives`. Fields might
     * appear in `eventually_due`, `currently_due`, `past_due` or `alternatives` and in `pending_verification` if one
     * verification fails but another is still pending.
     */
    public var pendingVerification: List<String>?
      get() = pendingVerificationValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pendingVerificationValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): AccountRequirements = AccountRequirements(
      alternatives = alternatives,
      currentDeadline = currentDeadline,
      currentlyDue = currentlyDue,
      disabledReason = disabledReason,
      errors = errors,
      eventuallyDue = eventuallyDue,
      pastDue = pastDue,
      pendingVerification = pendingVerification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountRequirements = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountRequirements> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountRequirements {
      val jsonDecoder = decoder.requireJsonDecoder("AccountRequirements")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountRequirements must be a JSON object")
      return AccountRequirements(
        alternatives = rawObject["alternatives"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<AccountRequirementsAlternative>?>(element) },
        currentDeadline = rawObject["current_deadline"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        currentlyDue = rawObject["currently_due"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        disabledReason = rawObject["disabled_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountRequirementsDisabledReasonX6c89d1f6?>(element) },
        errors = rawObject["errors"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<AccountRequirementsError>?>(element) },
        eventuallyDue = rawObject["eventually_due"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        pastDue = rawObject["past_due"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        pendingVerification = rawObject["pending_verification"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountRequirements) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountRequirements")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.alternatives?.let { put("alternatives", json.encodeToJsonElement(it)) }
        value.currentDeadline?.let { put("current_deadline", json.encodeToJsonElement(it)) }
        value.currentlyDue?.let { put("currently_due", json.encodeToJsonElement(it)) }
        value.disabledReason?.let { put("disabled_reason", json.encodeToJsonElement(it)) }
        value.errors?.let { put("errors", json.encodeToJsonElement(it)) }
        value.eventuallyDue?.let { put("eventually_due", json.encodeToJsonElement(it)) }
        value.pastDue?.let { put("past_due", json.encodeToJsonElement(it)) }
        value.pendingVerification?.let { put("pending_verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountRequirements(block: AccountRequirements.Builder.() -> Unit): AccountRequirements = AccountRequirements.build(block)
