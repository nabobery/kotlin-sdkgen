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

@Serializable
public data class ConnectAccountReferenceView(
    public val account: InlineConnectAccountReferenceAccountXebc59099? = null,
    public val type: InlineConnectAccountReferenceTypeXc6224d9c,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_account_reference
 */
@Serializable(with = ConnectAccountReference.Serializer::class)
public class ConnectAccountReference(
    /**
     * Type of the account referenced.
     */
    public val type: InlineConnectAccountReferenceTypeXc6224d9c,
    /**
     * The connected account being referenced when `type` is `account`.
     */
    public val account: InlineConnectAccountReferenceAccountXebc59099? = null,
) {
    public class Builder {
        private var typeValue: InlineConnectAccountReferenceTypeXc6224d9c? = null

        public var type: InlineConnectAccountReferenceTypeXc6224d9c
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The connected account being referenced when `type` is `account`.
         */
        public var account: InlineConnectAccountReferenceAccountXebc59099? = null

        public fun build(): ConnectAccountReference {
            check(typeValue != null) { "type is required" }
            return ConnectAccountReference(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConnectAccountReference = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConnectAccountReference> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConnectAccountReference {
            val jsonDecoder = decoder.requireJsonDecoder("ConnectAccountReference")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ConnectAccountReference must be a JSON object")
            val type = json.decodeRequired<InlineConnectAccountReferenceTypeXc6224d9c>(rawObject, "type")
            return ConnectAccountReference(
                type = type,
                account =
                    rawObject["account"]?.let {
                        json.decodeFromJsonElement<InlineConnectAccountReferenceAccountXebc59099>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConnectAccountReference,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConnectAccountReference")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.account?.let { put("account", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun connectAccountReference(block: ConnectAccountReference.Builder.() -> Unit): ConnectAccountReference =
    ConnectAccountReference.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("ConnectAccountReference is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
