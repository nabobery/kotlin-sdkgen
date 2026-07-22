package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller_stripe_dashboard
 */
@Serializable(with = AccountUnificationAccountControllerStripeDashboard.Serializer::class)
public class AccountUnificationAccountControllerStripeDashboard(
    /**
     * A value indicating the Stripe dashboard this account has access to independent of the Connect application.
     */
    public val type: InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79,
) {
    public class Builder {
        private var typeValue: InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79? =
            null

        public var type: InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): AccountUnificationAccountControllerStripeDashboard {
            check(typeValue != null) { "type is required" }
            return AccountUnificationAccountControllerStripeDashboard(
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): AccountUnificationAccountControllerStripeDashboard =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AccountUnificationAccountControllerStripeDashboard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AccountUnificationAccountControllerStripeDashboard {
            val jsonDecoder = decoder.requireJsonDecoder("AccountUnificationAccountControllerStripeDashboard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "AccountUnificationAccountControllerStripeDashboard must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79>(
                    rawObject,
                    "type",
                )
            return AccountUnificationAccountControllerStripeDashboard(
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AccountUnificationAccountControllerStripeDashboard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AccountUnificationAccountControllerStripeDashboard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun accountUnificationAccountControllerStripeDashboard(
    block: AccountUnificationAccountControllerStripeDashboard.Builder.() -> Unit,
): AccountUnificationAccountControllerStripeDashboard = AccountUnificationAccountControllerStripeDashboard.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "AccountUnificationAccountControllerStripeDashboard is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
