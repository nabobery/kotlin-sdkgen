package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineSetupIntentApplicationXbb7ee095Branch {
    Branch1,
    Application,
}

public sealed class InlineSetupIntentApplicationXbb7ee095DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentApplicationXbb7ee095NoMatchException(
    message: String,
) : InlineSetupIntentApplicationXbb7ee095DecodingException(message)

internal data class InlineSetupIntentApplicationXbb7ee095Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplication: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesApplication).count { it }
}

/**
 * ID of the Connect application that created the SetupIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/application
 */
@Serializable(with = InlineSetupIntentApplicationXbb7ee095.Serializer::class)
public class InlineSetupIntentApplicationXbb7ee095 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentApplicationXbb7ee095Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val application: Application? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null
        }

    public val matchedBranches: Set<InlineSetupIntentApplicationXbb7ee095Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSetupIntentApplicationXbb7ee095Branch.Branch1)
                if (inspection.matchesApplication) add(InlineSetupIntentApplicationXbb7ee095Branch.Application)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineSetupIntentApplicationXbb7ee095 {
            val inspection = inspectInlineSetupIntentApplicationXbb7ee095(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentApplicationXbb7ee095NoMatchException(
                    "InlineSetupIntentApplicationXbb7ee095 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentApplicationXbb7ee095(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentApplicationXbb7ee095> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentApplicationXbb7ee095 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentApplicationXbb7ee095")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentApplicationXbb7ee095,
        ) {
            encoder.requireJsonEncoder("InlineSetupIntentApplicationXbb7ee095").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentApplicationXbb7ee095(
    element: JsonElement,
): InlineSetupIntentApplicationXbb7ee095Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplication = element.isJsonDecodable<Application>()
    return InlineSetupIntentApplicationXbb7ee095Inspection(
        matchesBranch1 = matchesBranch1,
        matchesApplication = matchesApplication,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesApplication) add("Application: value does not match Application")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
