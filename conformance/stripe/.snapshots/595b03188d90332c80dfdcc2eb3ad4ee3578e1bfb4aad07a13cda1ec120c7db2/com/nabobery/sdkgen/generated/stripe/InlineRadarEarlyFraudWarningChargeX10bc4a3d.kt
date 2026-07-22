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

public enum class InlineRadarEarlyFraudWarningChargeX10bc4a3dBranch {
    Branch1,
    Charge,
}

public sealed class InlineRadarEarlyFraudWarningChargeX10bc4a3dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineRadarEarlyFraudWarningChargeX10bc4a3dNoMatchException(
    message: String,
) : InlineRadarEarlyFraudWarningChargeX10bc4a3dDecodingException(message)

internal data class InlineRadarEarlyFraudWarningChargeX10bc4a3dInspection(
    public val matchesBranch1: Boolean,
    public val matchesCharge: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the charge this early fraud warning is for, optionally expanded.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.early_fraud_warning/properties/charge
 */
@Serializable(with = InlineRadarEarlyFraudWarningChargeX10bc4a3d.Serializer::class)
public class InlineRadarEarlyFraudWarningChargeX10bc4a3d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineRadarEarlyFraudWarningChargeX10bc4a3dInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val matchedBranches: Set<InlineRadarEarlyFraudWarningChargeX10bc4a3dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineRadarEarlyFraudWarningChargeX10bc4a3dBranch.Branch1)
                if (inspection.matchesCharge) add(InlineRadarEarlyFraudWarningChargeX10bc4a3dBranch.Charge)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineRadarEarlyFraudWarningChargeX10bc4a3d {
            val inspection = inspectInlineRadarEarlyFraudWarningChargeX10bc4a3d(raw)
            if (inspection.matchCount == 0) {
                throw InlineRadarEarlyFraudWarningChargeX10bc4a3dNoMatchException(
                    "InlineRadarEarlyFraudWarningChargeX10bc4a3d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineRadarEarlyFraudWarningChargeX10bc4a3d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineRadarEarlyFraudWarningChargeX10bc4a3d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineRadarEarlyFraudWarningChargeX10bc4a3d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineRadarEarlyFraudWarningChargeX10bc4a3d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineRadarEarlyFraudWarningChargeX10bc4a3d,
        ) {
            encoder.requireJsonEncoder("InlineRadarEarlyFraudWarningChargeX10bc4a3d").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineRadarEarlyFraudWarningChargeX10bc4a3d(
    element: JsonElement,
): InlineRadarEarlyFraudWarningChargeX10bc4a3dInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    return InlineRadarEarlyFraudWarningChargeX10bc4a3dInspection(
        matchesBranch1 = matchesBranch1,
        matchesCharge = matchesCharge,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCharge) add("Charge: value does not match Charge")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
