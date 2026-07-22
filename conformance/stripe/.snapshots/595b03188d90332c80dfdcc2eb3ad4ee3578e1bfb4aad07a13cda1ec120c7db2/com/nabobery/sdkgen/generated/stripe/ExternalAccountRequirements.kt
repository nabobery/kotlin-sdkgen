package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class ExternalAccountRequirementsView(
    @SerialName("currently_due")
    public val currentlyDue: List<String>? = null,
    public val errors: List<AccountRequirementsError>? = null,
    @SerialName("past_due")
    public val pastDue: List<String>? = null,
    @SerialName("pending_verification")
    public val pendingVerification: List<String>? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/external_account_requirements
 */
@Serializable(with = ExternalAccountRequirements.Serializer::class)
public class ExternalAccountRequirements(
    /**
     * Fields that need to be resolved to keep the external account enabled. If not resolved by `current_deadline`, these
     * fields will appear in `past_due` as well, and the account is disabled.
     */
    public val currentlyDue: List<String>? = null,
    /**
     * Details about validation and verification failures for `due` requirements that must be resolved.
     */
    public val errors: List<AccountRequirementsError>? = null,
    /**
     * Fields that haven't been resolved by `current_deadline`. These fields need to be resolved to enable the external
     * account.
     */
    public val pastDue: List<String>? = null,
    /**
     * Fields that are being reviewed, or might become required depending on the results of a review. If the review fails,
     * these fields can move to `eventually_due`, `currently_due`, `past_due` or `alternatives`. Fields might appear in
     * `eventually_due`, `currently_due`, `past_due` or `alternatives` and in `pending_verification` if one verification
     * fails but another is still pending.
     */
    public val pendingVerification: List<String>? = null,
) {
    public class Builder {
        /**
         * Fields that need to be resolved to keep the external account enabled. If not resolved by `current_deadline`,
         * these fields will appear in `past_due` as well, and the account is disabled.
         */
        public var currentlyDue: List<String>? = null

        /**
         * Details about validation and verification failures for `due` requirements that must be resolved.
         */
        public var errors: List<AccountRequirementsError>? = null

        /**
         * Fields that haven't been resolved by `current_deadline`. These fields need to be resolved to enable the external
         * account.
         */
        public var pastDue: List<String>? = null

        /**
         * Fields that are being reviewed, or might become required depending on the results of a review. If the review
         * fails, these fields can move to `eventually_due`, `currently_due`, `past_due` or `alternatives`. Fields might
         * appear in `eventually_due`, `currently_due`, `past_due` or `alternatives` and in `pending_verification` if one
         * verification fails but another is still pending.
         */
        public var pendingVerification: List<String>? = null

        public fun build(): ExternalAccountRequirements =
            ExternalAccountRequirements(
                currentlyDue = currentlyDue,
                errors = errors,
                pastDue = pastDue,
                pendingVerification = pendingVerification,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ExternalAccountRequirements = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ExternalAccountRequirements> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ExternalAccountRequirements {
            val jsonDecoder = decoder.requireJsonDecoder("ExternalAccountRequirements")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ExternalAccountRequirements must be a JSON object")
            return ExternalAccountRequirements(
                currentlyDue =
                    rawObject["currently_due"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<String>?>(element)
                        }
                    },
                errors =
                    rawObject["errors"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<AccountRequirementsError>?>(element)
                        }
                    },
                pastDue =
                    rawObject["past_due"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<String>?>(element)
                        }
                    },
                pendingVerification =
                    rawObject["pending_verification"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<String>?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ExternalAccountRequirements,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ExternalAccountRequirements")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.currentlyDue?.let { put("currently_due", json.encodeToJsonElement(it)) }
                    value.errors?.let { put("errors", json.encodeToJsonElement(it)) }
                    value.pastDue?.let { put("past_due", json.encodeToJsonElement(it)) }
                    value.pendingVerification?.let { put("pending_verification", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun externalAccountRequirements(
    block: ExternalAccountRequirements.Builder.() -> Unit,
): ExternalAccountRequirements = ExternalAccountRequirements.build(block)
