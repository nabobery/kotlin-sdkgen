package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capability_requirements
 */
@Serializable(with = AccountCapabilityRequirements.Serializer::class)
public class AccountCapabilityRequirements(
    currentlyDue: List<String>,
    errors: List<AccountRequirementsError>,
    eventuallyDue: List<String>,
    pastDue: List<String>,
    pendingVerification: List<String>,
    /**
     * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Multiple
     * alternatives can reference the same `original_fields_due`. When this happens, any of these alternatives can serve
     * as a pathway for attempting to resolve the fields. Additionally, providing `original_fields_due` again also serves
     * as a pathway for attempting to resolve the fields.
     */
    public val alternatives: List<AccountRequirementsAlternative>? = null,
    /**
     * The date by which all required account information must be both submitted and verified. This includes fields listed
     * in `currently_due` as well as those in `pending_verification`. If any required information is missing or unverified
     * by this date, the account may be disabled. Note that `current_deadline` may change if additional `currently_due`
     * requirements are requested.
     */
    public val currentDeadline: Int? = null,
    /**
     * Description of why the capability is disabled. [Learn more about handling verification
     * issues](https://docs.stripe.com/connect/handling-api-verification).
     */
    public val disabledReason: InlineAccountCapabilityRequirementsDisabledReasonXbebf8378? = null,
) {
    /**
     * Fields that need to be resolved to keep the capability enabled. If not resolved by `current_deadline`, these fields
     * will appear in `past_due` as well, and the capability is disabled.
     */
    public val currentlyDue: List<String> = currentlyDue.toList()

    /**
     * Details about validation and verification failures for `due` requirements that must be resolved.
     */
    public val errors: List<AccountRequirementsError> = errors.toList()

    /**
     * Fields you must collect when all thresholds are reached. As they become required, they appear in `currently_due` as
     * well, and `current_deadline` becomes set.
     */
    public val eventuallyDue: List<String> = eventuallyDue.toList()

    /**
     * Fields that haven't been resolved by `current_deadline`. These fields need to be resolved to enable the capability
     * on the account.
     */
    public val pastDue: List<String> = pastDue.toList()

    /**
     * Fields that are being reviewed, or might become required depending on the results of a review. If the review fails,
     * these fields can move to `eventually_due`, `currently_due`, `past_due` or `alternatives`. Fields might appear in
     * `eventually_due`, `currently_due`, `past_due` or `alternatives` and in `pending_verification` if one verification
     * fails but another is still pending.
     */
    public val pendingVerification: List<String> = pendingVerification.toList()

    public class Builder {
        private var currentlyDueValue: List<String>? = null

        public var currentlyDue: List<String>
            get() = requireNotNull(currentlyDueValue) { "currentlyDue is required" }
            set(`value`) {
                currentlyDueValue = value
            }

        private var errorsValue: List<AccountRequirementsError>? = null

        public var errors: List<AccountRequirementsError>
            get() = requireNotNull(errorsValue) { "errors is required" }
            set(`value`) {
                errorsValue = value
            }

        private var eventuallyDueValue: List<String>? = null

        public var eventuallyDue: List<String>
            get() = requireNotNull(eventuallyDueValue) { "eventuallyDue is required" }
            set(`value`) {
                eventuallyDueValue = value
            }

        private var pastDueValue: List<String>? = null

        public var pastDue: List<String>
            get() = requireNotNull(pastDueValue) { "pastDue is required" }
            set(`value`) {
                pastDueValue = value
            }

        private var pendingVerificationValue: List<String>? = null

        public var pendingVerification: List<String>
            get() = requireNotNull(pendingVerificationValue) { "pendingVerification is required" }
            set(`value`) {
                pendingVerificationValue = value
            }

        /**
         * Fields that are due and can be resolved by providing the corresponding alternative fields instead. Multiple
         * alternatives can reference the same `original_fields_due`. When this happens, any of these alternatives can serve
         * as a pathway for attempting to resolve the fields. Additionally, providing `original_fields_due` again also
         * serves as a pathway for attempting to resolve the fields.
         */
        public var alternatives: List<AccountRequirementsAlternative>? = null

        /**
         * The date by which all required account information must be both submitted and verified. This includes fields
         * listed in `currently_due` as well as those in `pending_verification`. If any required information is missing or
         * unverified by this date, the account may be disabled. Note that `current_deadline` may change if additional
         * `currently_due` requirements are requested.
         */
        public var currentDeadline: Int? = null

        /**
         * Description of why the capability is disabled. [Learn more about handling verification
         * issues](https://docs.stripe.com/connect/handling-api-verification).
         */
        public var disabledReason: InlineAccountCapabilityRequirementsDisabledReasonXbebf8378? = null

        public fun build(): AccountCapabilityRequirements {
            check(currentlyDueValue != null) { "currentlyDue is required" }
            check(errorsValue != null) { "errors is required" }
            check(eventuallyDueValue != null) { "eventuallyDue is required" }
            check(pastDueValue != null) { "pastDue is required" }
            check(pendingVerificationValue != null) { "pendingVerification is required" }
            return AccountCapabilityRequirements(
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
        public fun build(block: Builder.() -> Unit): AccountCapabilityRequirements = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AccountCapabilityRequirements> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AccountCapabilityRequirements {
            val jsonDecoder = decoder.requireJsonDecoder("AccountCapabilityRequirements")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("AccountCapabilityRequirements must be a JSON object")
            val currentlyDue = json.decodeRequired<List<String>>(rawObject, "currently_due")
            val errors = json.decodeRequired<List<AccountRequirementsError>>(rawObject, "errors")
            val eventuallyDue = json.decodeRequired<List<String>>(rawObject, "eventually_due")
            val pastDue = json.decodeRequired<List<String>>(rawObject, "past_due")
            val pendingVerification = json.decodeRequired<List<String>>(rawObject, "pending_verification")
            return AccountCapabilityRequirements(
                currentlyDue = currentlyDue,
                errors = errors,
                eventuallyDue = eventuallyDue,
                pastDue = pastDue,
                pendingVerification = pendingVerification,
                alternatives =
                    rawObject["alternatives"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<AccountRequirementsAlternative>?>(element)
                        }
                    },
                currentDeadline =
                    rawObject["current_deadline"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                disabledReason =
                    rawObject["disabled_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAccountCapabilityRequirementsDisabledReasonXbebf8378?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AccountCapabilityRequirements,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AccountCapabilityRequirements")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
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

public fun accountCapabilityRequirements(
    block: AccountCapabilityRequirements.Builder.() -> Unit,
): AccountCapabilityRequirements = AccountCapabilityRequirements.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("AccountCapabilityRequirements is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
