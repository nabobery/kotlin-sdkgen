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

public enum class InlineApplicationFeeApplicationX0c97ee83Branch {
    Branch1,
    Application,
}

public sealed class InlineApplicationFeeApplicationX0c97ee83DecodingException(
    message: String,
) : SerializationException(message)

public class InlineApplicationFeeApplicationX0c97ee83NoMatchException(
    message: String,
) : InlineApplicationFeeApplicationX0c97ee83DecodingException(message)

internal data class InlineApplicationFeeApplicationX0c97ee83Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplication: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesApplication).count { it }
}

/**
 * ID of the Connect application that earned the fee.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/application
 */
@Serializable(with = InlineApplicationFeeApplicationX0c97ee83.Serializer::class)
public class InlineApplicationFeeApplicationX0c97ee83 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineApplicationFeeApplicationX0c97ee83Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val application: Application? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null
        }

    public val matchedBranches: Set<InlineApplicationFeeApplicationX0c97ee83Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineApplicationFeeApplicationX0c97ee83Branch.Branch1)
                if (inspection.matchesApplication) add(InlineApplicationFeeApplicationX0c97ee83Branch.Application)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineApplicationFeeApplicationX0c97ee83 {
            val inspection = inspectInlineApplicationFeeApplicationX0c97ee83(raw)
            if (inspection.matchCount == 0) {
                throw InlineApplicationFeeApplicationX0c97ee83NoMatchException(
                    "InlineApplicationFeeApplicationX0c97ee83 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineApplicationFeeApplicationX0c97ee83(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineApplicationFeeApplicationX0c97ee83> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineApplicationFeeApplicationX0c97ee83 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeApplicationX0c97ee83")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineApplicationFeeApplicationX0c97ee83,
        ) {
            encoder.requireJsonEncoder("InlineApplicationFeeApplicationX0c97ee83").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineApplicationFeeApplicationX0c97ee83(
    element: JsonElement,
): InlineApplicationFeeApplicationX0c97ee83Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplication = element.isJsonDecodable<Application>()
    return InlineApplicationFeeApplicationX0c97ee83Inspection(
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
