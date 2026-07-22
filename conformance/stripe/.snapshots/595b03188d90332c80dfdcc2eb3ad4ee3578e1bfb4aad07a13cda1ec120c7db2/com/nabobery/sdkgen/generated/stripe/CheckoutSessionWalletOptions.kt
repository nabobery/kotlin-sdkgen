package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

@Serializable
public data class CheckoutSessionWalletOptionsView(
    public val link: CheckoutLinkWalletOptions? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_session_wallet_options
 */
@Serializable(with = CheckoutSessionWalletOptions.Serializer::class)
public class CheckoutSessionWalletOptions(
    public val link: CheckoutLinkWalletOptions? = null,
) {
    public class Builder {
        public var link: CheckoutLinkWalletOptions? = null

        public fun build(): CheckoutSessionWalletOptions =
            CheckoutSessionWalletOptions(
                link = link,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutSessionWalletOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutSessionWalletOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutSessionWalletOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutSessionWalletOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutSessionWalletOptions must be a JSON object")
            return CheckoutSessionWalletOptions(
                link = rawObject["link"]?.let { json.decodeFromJsonElement<CheckoutLinkWalletOptions>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutSessionWalletOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutSessionWalletOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.link?.let { put("link", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutSessionWalletOptions(
    block: CheckoutSessionWalletOptions.Builder.() -> Unit,
): CheckoutSessionWalletOptions = CheckoutSessionWalletOptions.build(block)
