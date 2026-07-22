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

public enum class InlineSubscriptionApplicationX28439c61Branch {
    Branch1,
    Application,
    DeletedApplication,
}

public sealed class InlineSubscriptionApplicationX28439c61DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionApplicationX28439c61NoMatchException(
    message: String,
) : InlineSubscriptionApplicationX28439c61DecodingException(message)

internal data class InlineSubscriptionApplicationX28439c61Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplication: Boolean,
    public val matchesDeletedApplication: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesApplication, matchesDeletedApplication).count { it }
}

/**
 * ID of the Connect Application that created the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/application
 */
@Serializable(with = InlineSubscriptionApplicationX28439c61.Serializer::class)
public class InlineSubscriptionApplicationX28439c61 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionApplicationX28439c61Inspection,
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

    public val matchedBranches: Set<InlineSubscriptionApplicationX28439c61Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSubscriptionApplicationX28439c61Branch.Branch1)
                if (inspection.matchesApplication) add(InlineSubscriptionApplicationX28439c61Branch.Application)
                if (inspection.matchesDeletedApplication) {
                    add(
                        InlineSubscriptionApplicationX28439c61Branch.DeletedApplication,
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
        ): InlineSubscriptionApplicationX28439c61 {
            val inspection = inspectInlineSubscriptionApplicationX28439c61(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionApplicationX28439c61NoMatchException(
                    "InlineSubscriptionApplicationX28439c61 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionApplicationX28439c61(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionApplicationX28439c61> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionApplicationX28439c61 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionApplicationX28439c61")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionApplicationX28439c61,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionApplicationX28439c61").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionApplicationX28439c61(
    element: JsonElement,
): InlineSubscriptionApplicationX28439c61Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplication = element.isJsonDecodable<Application>()
    val matchesDeletedApplication = element.isJsonDecodable<DeletedApplication>()
    return InlineSubscriptionApplicationX28439c61Inspection(
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
