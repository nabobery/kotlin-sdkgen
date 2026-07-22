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
 * Source: sdkgen://source/openapi.json#/components/schemas/secret_service_resource_scope
 */
@Serializable(with = SecretServiceResourceScope.Serializer::class)
public class SecretServiceResourceScope(
    /**
     * The secret scope type.
     */
    public val type: InlineSecretServiceResourceScopeTypeX4fce8e76,
    /**
     * The user ID, if type is set to "user"
     */
    public val user: String? = null,
) {
    public class Builder {
        private var typeValue: InlineSecretServiceResourceScopeTypeX4fce8e76? = null

        public var type: InlineSecretServiceResourceScopeTypeX4fce8e76
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The user ID, if type is set to "user"
         */
        public var user: String? = null

        public fun build(): SecretServiceResourceScope {
            check(typeValue != null) { "type is required" }
            return SecretServiceResourceScope(
                type = type,
                user = user,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SecretServiceResourceScope = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SecretServiceResourceScope> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SecretServiceResourceScope {
            val jsonDecoder = decoder.requireJsonDecoder("SecretServiceResourceScope")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SecretServiceResourceScope must be a JSON object")
            val type = json.decodeRequired<InlineSecretServiceResourceScopeTypeX4fce8e76>(rawObject, "type")
            return SecretServiceResourceScope(
                type = type,
                user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SecretServiceResourceScope,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SecretServiceResourceScope")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.user?.let { put("user", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun secretServiceResourceScope(
    block: SecretServiceResourceScope.Builder.() -> Unit,
): SecretServiceResourceScope = SecretServiceResourceScope.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("SecretServiceResourceScope is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
