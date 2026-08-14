package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capability_future_requirements
 */
@Serializable(with = AccountCapabilityFutureRequirements.Serializer::class)
public class AccountCapabilityFutureRequirements(
  currentlyDue: List<String>,
  errors: List<AccountRequirementsError>,
  eventuallyDue: List<String>,
  pastDue: List<String>,
  pendingVerification: List<String>,
  alternatives: List<AccountRequirementsAlternative>? = null,
  /**
   * Date on which `future_requirements` becomes the main `requirements` hash and `future_requirements` becomes empty.
   * After the transition, `currently_due` requirements may immediately become `past_due`, but the account may also be
   * given a grace period depending on the capability's enablement state prior to transitioning.
   */
  public val currentDeadline: Int? = null,
  /**
   * This is typed as an enum for consistency with `requirements.disabled_reason`, but it safe to assume
   * `future_requirements.disabled_reason` is null because fields in `future_requirements` will never disable the
   * account.
   */
  public val disabledReason:
      InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06? = null,
) {
  /**
   * Fields that need to be resolved to keep the capability enabled. If not resolved by
   * `future_requirements[current_deadline]`, these fields will transition to the main `requirements` hash.
   */
  public val currentlyDue: List<String> = currentlyDue.toList()

  /**
   * Details about validation and verification failures for `due` requirements that must be resolved.
   */
  public val errors: List<AccountRequirementsError> = errors.toList()

  /**
   * Fields you must collect when all thresholds are reached. As they become required, they appear in `currently_due` as
   * well.
   */
  public val eventuallyDue: List<String> = eventuallyDue.toList()

  /**
   * Fields that haven't been resolved by `requirements.current_deadline`. These fields need to be resolved to enable
   * the capability on the account. `future_requirements.past_due` is a subset of `requirements.past_due`.
   */
  public val pastDue: List<String> = pastDue.toList()

  /**
   * Fields that are being reviewed, or might become required depending on the results of a review. If the review fails,
   * these fields can move to `eventually_due`, `currently_due`, `past_due` or `alternatives`. Fields might appear in
   * `eventually_due`, `currently_due`, `past_due` or `alternatives` and in `pending_verification` if one verification
   * fails but another is still pending.
   */
  public val pendingVerification: List<String> = pendingVerification.toList()

  /**
   * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Multiple
   * alternatives can reference the same `original_fields_due`. When this happens, any of these alternatives can serve
   * as a pathway for attempting to resolve the fields. Additionally, providing `original_fields_due` again also serves
   * as a pathway for attempting to resolve the fields.
   */
  public val alternatives: List<AccountRequirementsAlternative>? =
      alternatives?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var currentlyDueValue: List<String>? = null

    public var currentlyDue: List<String>
      get() = requireNotNull(currentlyDueValue) { "currentlyDue is required" }.toList()
      set(`value`) {
        currentlyDueValue = value.toList()
      }

    private var errorsValue: List<AccountRequirementsError>? = null

    public var errors: List<AccountRequirementsError>
      get() = requireNotNull(errorsValue) { "errors is required" }.toList()
      set(`value`) {
        errorsValue = value.toList()
      }

    private var eventuallyDueValue: List<String>? = null

    public var eventuallyDue: List<String>
      get() = requireNotNull(eventuallyDueValue) { "eventuallyDue is required" }.toList()
      set(`value`) {
        eventuallyDueValue = value.toList()
      }

    private var pastDueValue: List<String>? = null

    public var pastDue: List<String>
      get() = requireNotNull(pastDueValue) { "pastDue is required" }.toList()
      set(`value`) {
        pastDueValue = value.toList()
      }

    private var pendingVerificationValue: List<String>? = null

    public var pendingVerification: List<String>
      get() = requireNotNull(pendingVerificationValue) { "pendingVerification is required" }.toList()
      set(`value`) {
        pendingVerificationValue = value.toList()
      }

    private var alternativesValue: List<AccountRequirementsAlternative>? = null

    /**
     * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Multiple
     * alternatives can reference the same `original_fields_due`. When this happens, any of these alternatives can serve
     * as a pathway for attempting to resolve the fields. Additionally, providing `original_fields_due` again also
     * serves as a pathway for attempting to resolve the fields.
     */
    public var alternatives: List<AccountRequirementsAlternative>?
      get() = alternativesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        alternativesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Date on which `future_requirements` becomes the main `requirements` hash and `future_requirements` becomes empty.
     * After the transition, `currently_due` requirements may immediately become `past_due`, but the account may also be
     * given a grace period depending on the capability's enablement state prior to transitioning.
     */
    public var currentDeadline: Int? = null

    /**
     * This is typed as an enum for consistency with `requirements.disabled_reason`, but it safe to assume
     * `future_requirements.disabled_reason` is null because fields in `future_requirements` will never disable the
     * account.
     */
    public var disabledReason: InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06? =
        null

    public fun build(): AccountCapabilityFutureRequirements {
      check(currentlyDueValue != null) { "currentlyDue is required" }
      check(errorsValue != null) { "errors is required" }
      check(eventuallyDueValue != null) { "eventuallyDue is required" }
      check(pastDueValue != null) { "pastDue is required" }
      check(pendingVerificationValue != null) { "pendingVerification is required" }
      return AccountCapabilityFutureRequirements(
        currentlyDue = currentlyDue,
        errors = errors,
        eventuallyDue = eventuallyDue,
        pastDue = pastDue,
        pendingVerification = pendingVerification,
        alternatives = alternatives,
        currentDeadline = currentDeadline,
        disabledReason = disabledReason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountCapabilityFutureRequirements = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountCapabilityFutureRequirements> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountCapabilityFutureRequirements {
      val jsonDecoder = decoder.requireJsonDecoder("AccountCapabilityFutureRequirements")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountCapabilityFutureRequirements must be a JSON object")
      val currentlyDue = json.decodeRequired<List<String>>(rawObject, "currently_due")
      val errors = json.decodeRequired<List<AccountRequirementsError>>(rawObject, "errors")
      val eventuallyDue = json.decodeRequired<List<String>>(rawObject, "eventually_due")
      val pastDue = json.decodeRequired<List<String>>(rawObject, "past_due")
      val pendingVerification = json.decodeRequired<List<String>>(rawObject, "pending_verification")
      return AccountCapabilityFutureRequirements(
        currentlyDue = currentlyDue,
        errors = errors,
        eventuallyDue = eventuallyDue,
        pastDue = pastDue,
        pendingVerification = pendingVerification,
        alternatives = rawObject["alternatives"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<AccountRequirementsAlternative>?>(element) },
        currentDeadline = rawObject["current_deadline"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        disabledReason = rawObject["disabled_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountCapabilityFutureRequirements) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountCapabilityFutureRequirements")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currently_due", json.encodeToJsonElement(value.currentlyDue))
        put("errors", json.encodeToJsonElement(value.errors))
        put("eventually_due", json.encodeToJsonElement(value.eventuallyDue))
        put("past_due", json.encodeToJsonElement(value.pastDue))
        put("pending_verification", json.encodeToJsonElement(value.pendingVerification))
        value.alternatives?.let { put("alternatives", json.encodeToJsonElement(it)) }
        value.currentDeadline?.let { put("current_deadline", json.encodeToJsonElement(it)) }
        value.disabledReason?.let { put("disabled_reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountCapabilityFutureRequirements(block: AccountCapabilityFutureRequirements.Builder.() -> Unit): AccountCapabilityFutureRequirements = AccountCapabilityFutureRequirements.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountCapabilityFutureRequirements is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
