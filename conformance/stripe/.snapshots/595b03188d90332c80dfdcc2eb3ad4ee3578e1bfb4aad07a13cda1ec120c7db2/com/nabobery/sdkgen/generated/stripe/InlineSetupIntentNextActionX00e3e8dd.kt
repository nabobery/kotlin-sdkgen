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

public enum class InlineSetupIntentNextActionX00e3e8ddBranch {
    SetupIntentNextAction,
}

public sealed class InlineSetupIntentNextActionX00e3e8ddDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentNextActionX00e3e8ddNoMatchException(
    message: String,
) : InlineSetupIntentNextActionX00e3e8ddDecodingException(message)

internal data class InlineSetupIntentNextActionX00e3e8ddInspection(
    public val matchesSetupIntentNextAction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSetupIntentNextAction).count { it }
}

/**
 * If present, this property tells you what actions you need to take in order for your customer to continue payment
 * setup.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/next_action
 */
@Serializable(with = InlineSetupIntentNextActionX00e3e8dd.Serializer::class)
public class InlineSetupIntentNextActionX00e3e8dd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentNextActionX00e3e8ddInspection,
) {
    public val setupIntentNextAction: SetupIntentNextActionView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupIntentNextAction) {
                json.decodeFromJsonElement<SetupIntentNextActionView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSetupIntentNextActionX00e3e8ddBranch>
        get() =
            buildSet {
                if (inspection.matchesSetupIntentNextAction) {
                    add(
                        InlineSetupIntentNextActionX00e3e8ddBranch.SetupIntentNextAction,
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
        ): InlineSetupIntentNextActionX00e3e8dd {
            val inspection = inspectInlineSetupIntentNextActionX00e3e8dd(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentNextActionX00e3e8ddNoMatchException(
                    "InlineSetupIntentNextActionX00e3e8dd matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineSetupIntentNextActionX00e3e8dd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentNextActionX00e3e8dd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentNextActionX00e3e8dd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentNextActionX00e3e8dd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentNextActionX00e3e8dd,
        ) {
            encoder.requireJsonEncoder("InlineSetupIntentNextActionX00e3e8dd").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentNextActionX00e3e8dd(
    element: JsonElement,
): InlineSetupIntentNextActionX00e3e8ddInspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentNextActionX00e3e8ddInspection(
            matchesSetupIntentNextAction = false,
            failures = listOf("SetupIntentNextAction: expected JSON object"),
        )
    val matchesSetupIntentNextAction = raw["type"].isString()
    return InlineSetupIntentNextActionX00e3e8ddInspection(
        matchesSetupIntentNextAction = matchesSetupIntentNextAction,
        failures =
            buildList {
                if (!matchesSetupIntentNextAction) {
                    add(
                        "SetupIntentNextAction: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
