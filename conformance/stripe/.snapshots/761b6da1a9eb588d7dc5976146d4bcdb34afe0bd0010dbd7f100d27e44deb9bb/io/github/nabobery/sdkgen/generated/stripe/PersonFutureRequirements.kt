package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class PersonFutureRequirementsView internal constructor(
  public val alternatives: List<AccountRequirementsAlternative>? = null,
  @SerialName("currently_due")
  public val currentlyDue: List<String>,
  public val errors: List<AccountRequirementsError>,
  @SerialName("eventually_due")
  public val eventuallyDue: List<String>,
  @SerialName("past_due")
  public val pastDue: List<String>,
  @SerialName("pending_verification")
  public val pendingVerification: List<String>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_future_requirements
 */
@Serializable(with = PersonFutureRequirements.Serializer::class)
public class PersonFutureRequirements(
  currentlyDue: List<String>,
  errors: List<AccountRequirementsError>,
  eventuallyDue: List<String>,
  pastDue: List<String>,
  pendingVerification: List<String>,
  alternatives: List<AccountRequirementsAlternative>? = null,
) {
  /**
   * Fields that need to be resolved to keep the person's account enabled. If not resolved by the account's
   * `future_requirements[current_deadline]`, these fields will transition to the main `requirements` hash, and may
   * immediately become `past_due`, but the account may also be given a grace period depending on the account's
   * enablement state prior to transition.
   */
  public val currentlyDue: List<String> = currentlyDue.toList()

  /**
   * Details about validation and verification failures for `due` requirements that must be resolved.
   */
  public val errors: List<AccountRequirementsError> = errors.toList()

  /**
   * Fields you must collect when all thresholds are reached. As they become required, they appear in `currently_due` as
   * well, and the account's `future_requirements[current_deadline]` becomes set.
   */
  public val eventuallyDue: List<String> = eventuallyDue.toList()

  /**
   * Fields that haven't been resolved by the account's `requirements.current_deadline`. These fields need to be
   * resolved to enable the person's account. `future_requirements.past_due` is a subset of `requirements.past_due`.
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
   * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Many
   * alternatives can list the same `original_fields_due`, and any of these alternatives can serve as a pathway for
   * attempting to resolve the fields again. Re-providing `original_fields_due` also serves as a pathway for attempting
   * to resolve the fields again.
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

    public fun build(): PersonFutureRequirements {
      check(currentlyDueValue != null) { "currentlyDue is required" }
      check(errorsValue != null) { "errors is required" }
      check(eventuallyDueValue != null) { "eventuallyDue is required" }
      check(pastDueValue != null) { "pastDue is required" }
      check(pendingVerificationValue != null) { "pendingVerification is required" }
      return PersonFutureRequirements(
        currentlyDue = currentlyDue,
        errors = errors,
        eventuallyDue = eventuallyDue,
        pastDue = pastDue,
        pendingVerification = pendingVerification,
        alternatives = alternatives,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PersonFutureRequirements = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PersonFutureRequirements> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PersonFutureRequirements {
      val jsonDecoder = decoder.requireJsonDecoder("PersonFutureRequirements")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PersonFutureRequirements must be a JSON object")
      val currentlyDue = json.decodeRequired<List<String>>(rawObject, "currently_due")
      val errors = json.decodeRequired<List<AccountRequirementsError>>(rawObject, "errors")
      val eventuallyDue = json.decodeRequired<List<String>>(rawObject, "eventually_due")
      val pastDue = json.decodeRequired<List<String>>(rawObject, "past_due")
      val pendingVerification = json.decodeRequired<List<String>>(rawObject, "pending_verification")
      return PersonFutureRequirements(
        currentlyDue = currentlyDue,
        errors = errors,
        eventuallyDue = eventuallyDue,
        pastDue = pastDue,
        pendingVerification = pendingVerification,
        alternatives = rawObject["alternatives"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<AccountRequirementsAlternative>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PersonFutureRequirements) {
      val jsonEncoder = encoder.requireJsonEncoder("PersonFutureRequirements")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currently_due", json.encodeToJsonElement(value.currentlyDue))
        put("errors", json.encodeToJsonElement(value.errors))
        put("eventually_due", json.encodeToJsonElement(value.eventuallyDue))
        put("past_due", json.encodeToJsonElement(value.pastDue))
        put("pending_verification", json.encodeToJsonElement(value.pendingVerification))
        value.alternatives?.let { put("alternatives", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun personFutureRequirements(block: PersonFutureRequirements.Builder.() -> Unit): PersonFutureRequirements = PersonFutureRequirements.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PersonFutureRequirements is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
