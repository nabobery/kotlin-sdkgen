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

public enum class InlineQuoteApplicationX6159df96Branch {
    Branch1,
    Application,
    DeletedApplication,
}

public sealed class InlineQuoteApplicationX6159df96DecodingException(
    message: String,
) : SerializationException(message)

public class InlineQuoteApplicationX6159df96NoMatchException(
    message: String,
) : InlineQuoteApplicationX6159df96DecodingException(message)

internal data class InlineQuoteApplicationX6159df96Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplication: Boolean,
    public val matchesDeletedApplication: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesApplication, matchesDeletedApplication).count { it }
}

/**
 * ID of the Connect Application that created the quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/application
 */
@Serializable(with = InlineQuoteApplicationX6159df96.Serializer::class)
public class InlineQuoteApplicationX6159df96 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineQuoteApplicationX6159df96Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val application: Application? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null
        }

    public val deletedApplication: DeletedApplication? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedApplication) json.decodeFromJsonElement<DeletedApplication>(raw) else null
        }

    public val matchedBranches: Set<InlineQuoteApplicationX6159df96Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineQuoteApplicationX6159df96Branch.Branch1)
                if (inspection.matchesApplication) add(InlineQuoteApplicationX6159df96Branch.Application)
                if (inspection.matchesDeletedApplication) add(InlineQuoteApplicationX6159df96Branch.DeletedApplication)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineQuoteApplicationX6159df96 {
            val inspection = inspectInlineQuoteApplicationX6159df96(raw)
            if (inspection.matchCount == 0) {
                throw InlineQuoteApplicationX6159df96NoMatchException(
                    "InlineQuoteApplicationX6159df96 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineQuoteApplicationX6159df96(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineQuoteApplicationX6159df96> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineQuoteApplicationX6159df96 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteApplicationX6159df96")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineQuoteApplicationX6159df96,
        ) {
            encoder.requireJsonEncoder("InlineQuoteApplicationX6159df96").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineQuoteApplicationX6159df96(element: JsonElement): InlineQuoteApplicationX6159df96Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplication = element.isJsonDecodable<Application>()
    val matchesDeletedApplication = element.isJsonDecodable<DeletedApplication>()
    return InlineQuoteApplicationX6159df96Inspection(
        matchesBranch1 = matchesBranch1,
        matchesApplication = matchesApplication,
        matchesDeletedApplication = matchesDeletedApplication,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesApplication) add("Application: value does not match Application")
                if (!matchesDeletedApplication) add("DeletedApplication: value does not match DeletedApplication")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
