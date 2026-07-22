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

public enum class InlineInvoiceRenderingXdc55f306Branch {
    InvoicesResourceInvoiceRendering,
}

public sealed class InlineInvoiceRenderingXdc55f306DecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceRenderingXdc55f306NoMatchException(
    message: String,
) : InlineInvoiceRenderingXdc55f306DecodingException(message)

internal data class InlineInvoiceRenderingXdc55f306Inspection(
    public val matchesInvoicesResourceInvoiceRendering: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInvoicesResourceInvoiceRendering).count { it }
}

/**
 * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF and
 * Hosted Invoice Page.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/rendering
 */
@Serializable(with = InlineInvoiceRenderingXdc55f306.Serializer::class)
public class InlineInvoiceRenderingXdc55f306 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceRenderingXdc55f306Inspection,
) {
    public val invoicesResourceInvoiceRendering: InvoicesResourceInvoiceRenderingView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInvoicesResourceInvoiceRendering) {
                json
                    .decodeFromJsonElement<InvoicesResourceInvoiceRenderingView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineInvoiceRenderingXdc55f306Branch>
        get() =
            buildSet {
                if (inspection.matchesInvoicesResourceInvoiceRendering) {
                    add(
                        InlineInvoiceRenderingXdc55f306Branch.InvoicesResourceInvoiceRendering,
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
        ): InlineInvoiceRenderingXdc55f306 {
            val inspection = inspectInlineInvoiceRenderingXdc55f306(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceRenderingXdc55f306NoMatchException(
                    "InlineInvoiceRenderingXdc55f306 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceRenderingXdc55f306(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceRenderingXdc55f306> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceRenderingXdc55f306 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceRenderingXdc55f306")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceRenderingXdc55f306,
        ) {
            encoder.requireJsonEncoder("InlineInvoiceRenderingXdc55f306").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceRenderingXdc55f306(element: JsonElement): InlineInvoiceRenderingXdc55f306Inspection {
    val raw =
        element as? JsonObject ?: return InlineInvoiceRenderingXdc55f306Inspection(
            matchesInvoicesResourceInvoiceRendering = false,
            failures = listOf("InvoicesResourceInvoiceRendering: expected JSON object"),
        )
    val matchesInvoicesResourceInvoiceRendering = true
    return InlineInvoiceRenderingXdc55f306Inspection(
        matchesInvoicesResourceInvoiceRendering = matchesInvoicesResourceInvoiceRendering,
        failures =
            buildList {
                if (!matchesInvoicesResourceInvoiceRendering) {
                    add(
                        "InvoicesResourceInvoiceRendering: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
