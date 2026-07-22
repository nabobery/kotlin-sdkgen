package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_after_completion
 */
@Serializable(with = PortalFlowsFlowAfterCompletion.Serializer::class)
public class PortalFlowsFlowAfterCompletion(
    /**
     * The specified type of behavior after the flow is completed.
     */
    public val type: InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4,
    /**
     * Configuration when `after_completion.type=hosted_confirmation`.
     */
    public val hostedConfirmation: InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3? = null,
    /**
     * Configuration when `after_completion.type=redirect`.
     */
    public val redirect: InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4? = null,
) {
    public class Builder {
        private var typeValue: InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4? = null

        public var type: InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * Configuration when `after_completion.type=hosted_confirmation`.
         */
        public var hostedConfirmation: InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3? =
            null

        /**
         * Configuration when `after_completion.type=redirect`.
         */
        public var redirect: InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4? = null

        public fun build(): PortalFlowsFlowAfterCompletion {
            check(typeValue != null) { "type is required" }
            return PortalFlowsFlowAfterCompletion(
                type = type,
                hostedConfirmation = hostedConfirmation,
                redirect = redirect,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PortalFlowsFlowAfterCompletion = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PortalFlowsFlowAfterCompletion> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PortalFlowsFlowAfterCompletion {
            val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsFlowAfterCompletion")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PortalFlowsFlowAfterCompletion must be a JSON object")
            val type = json.decodeRequired<InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4>(rawObject, "type")
            return PortalFlowsFlowAfterCompletion(
                type = type,
                hostedConfirmation =
                    rawObject["hosted_confirmation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3?>(
                                    element,
                                )
                        }
                    },
                redirect =
                    rawObject["redirect"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PortalFlowsFlowAfterCompletion,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsFlowAfterCompletion")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.hostedConfirmation?.let { put("hosted_confirmation", json.encodeToJsonElement(it)) }
                    value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun portalFlowsFlowAfterCompletion(
    block: PortalFlowsFlowAfterCompletion.Builder.() -> Unit,
): PortalFlowsFlowAfterCompletion = PortalFlowsFlowAfterCompletion.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PortalFlowsFlowAfterCompletion is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
