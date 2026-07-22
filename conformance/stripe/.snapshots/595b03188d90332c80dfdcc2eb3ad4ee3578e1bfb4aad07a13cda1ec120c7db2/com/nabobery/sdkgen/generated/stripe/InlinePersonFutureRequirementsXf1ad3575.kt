package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlinePersonFutureRequirementsXf1ad3575Branch {
    PersonFutureRequirements,
}

public sealed class InlinePersonFutureRequirementsXf1ad3575DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePersonFutureRequirementsXf1ad3575NoMatchException(
    message: String,
) : InlinePersonFutureRequirementsXf1ad3575DecodingException(message)

internal data class InlinePersonFutureRequirementsXf1ad3575Inspection(
    public val matchesPersonFutureRequirements: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPersonFutureRequirements).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/person/properties/future_requirements.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person/properties/future_requirements
 */
@Serializable(with = InlinePersonFutureRequirementsXf1ad3575.Serializer::class)
public class InlinePersonFutureRequirementsXf1ad3575 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePersonFutureRequirementsXf1ad3575Inspection,
) {
    public val personFutureRequirements: PersonFutureRequirementsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPersonFutureRequirements) {
                json.decodeFromJsonElement<PersonFutureRequirementsView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePersonFutureRequirementsXf1ad3575Branch>
        get() =
            buildSet {
                if (inspection.matchesPersonFutureRequirements) {
                    add(
                        InlinePersonFutureRequirementsXf1ad3575Branch.PersonFutureRequirements,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePersonFutureRequirementsXf1ad3575 {
            val inspection = inspectInlinePersonFutureRequirementsXf1ad3575(raw)
            if (inspection.matchCount == 0) {
                throw InlinePersonFutureRequirementsXf1ad3575NoMatchException(
                    "InlinePersonFutureRequirementsXf1ad3575 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePersonFutureRequirementsXf1ad3575(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePersonFutureRequirementsXf1ad3575> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePersonFutureRequirementsXf1ad3575 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePersonFutureRequirementsXf1ad3575")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePersonFutureRequirementsXf1ad3575,
        ) {
            encoder.requireJsonEncoder("InlinePersonFutureRequirementsXf1ad3575").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePersonFutureRequirementsXf1ad3575(
    element: JsonElement,
): InlinePersonFutureRequirementsXf1ad3575Inspection {
    val raw =
        element as? JsonObject ?: return InlinePersonFutureRequirementsXf1ad3575Inspection(
            matchesPersonFutureRequirements = false,
            failures = listOf("PersonFutureRequirements: expected JSON object"),
        )
    val matchesPersonFutureRequirements =
        raw["currently_due"].isStringArray() && raw["errors"] != null && raw["eventually_due"].isStringArray() &&
            raw["past_due"].isStringArray() &&
            raw["pending_verification"].isStringArray()
    return InlinePersonFutureRequirementsXf1ad3575Inspection(
        matchesPersonFutureRequirements = matchesPersonFutureRequirements,
        failures =
            buildList {
                if (!matchesPersonFutureRequirements) {
                    add(
                        "PersonFutureRequirements: required properties 'currently_due', 'errors', 'eventually_due', 'past_due', 'pending_verification' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
