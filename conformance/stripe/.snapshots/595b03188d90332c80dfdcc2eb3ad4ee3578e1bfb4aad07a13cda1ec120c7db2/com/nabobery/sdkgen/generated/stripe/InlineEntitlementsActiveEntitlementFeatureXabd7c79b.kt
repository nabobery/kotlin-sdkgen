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

public enum class InlineEntitlementsActiveEntitlementFeatureXabd7c79bBranch {
    Branch1,
    EntitlementsFeature,
}

public sealed class InlineEntitlementsActiveEntitlementFeatureXabd7c79bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineEntitlementsActiveEntitlementFeatureXabd7c79bNoMatchException(
    message: String,
) : InlineEntitlementsActiveEntitlementFeatureXabd7c79bDecodingException(message)

internal data class InlineEntitlementsActiveEntitlementFeatureXabd7c79bInspection(
    public val matchesBranch1: Boolean,
    public val matchesEntitlementsFeature: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesEntitlementsFeature).count { it }
}

/**
 * The [Feature](https://docs.stripe.com/api/entitlements/feature) that the customer is entitled to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/entitlements.active_entitlement/properties/feature
 */
@Serializable(with = InlineEntitlementsActiveEntitlementFeatureXabd7c79b.Serializer::class)
public class InlineEntitlementsActiveEntitlementFeatureXabd7c79b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineEntitlementsActiveEntitlementFeatureXabd7c79bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val entitlementsFeature: EntitlementsFeature? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesEntitlementsFeature) json.decodeFromJsonElement<EntitlementsFeature>(raw) else null
        }

    public val matchedBranches: Set<InlineEntitlementsActiveEntitlementFeatureXabd7c79bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineEntitlementsActiveEntitlementFeatureXabd7c79bBranch.Branch1)
                if (inspection.matchesEntitlementsFeature) {
                    add(
                        InlineEntitlementsActiveEntitlementFeatureXabd7c79bBranch.EntitlementsFeature,
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
        ): InlineEntitlementsActiveEntitlementFeatureXabd7c79b {
            val inspection = inspectInlineEntitlementsActiveEntitlementFeatureXabd7c79b(raw)
            if (inspection.matchCount == 0) {
                throw InlineEntitlementsActiveEntitlementFeatureXabd7c79bNoMatchException(
                    "InlineEntitlementsActiveEntitlementFeatureXabd7c79b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineEntitlementsActiveEntitlementFeatureXabd7c79b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineEntitlementsActiveEntitlementFeatureXabd7c79b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineEntitlementsActiveEntitlementFeatureXabd7c79b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineEntitlementsActiveEntitlementFeatureXabd7c79b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineEntitlementsActiveEntitlementFeatureXabd7c79b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineEntitlementsActiveEntitlementFeatureXabd7c79b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineEntitlementsActiveEntitlementFeatureXabd7c79b(
    element: JsonElement,
): InlineEntitlementsActiveEntitlementFeatureXabd7c79bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesEntitlementsFeature = element.isJsonDecodable<EntitlementsFeature>()
    return InlineEntitlementsActiveEntitlementFeatureXabd7c79bInspection(
        matchesBranch1 = matchesBranch1,
        matchesEntitlementsFeature = matchesEntitlementsFeature,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesEntitlementsFeature) add("EntitlementsFeature: value does not match EntitlementsFeature")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
