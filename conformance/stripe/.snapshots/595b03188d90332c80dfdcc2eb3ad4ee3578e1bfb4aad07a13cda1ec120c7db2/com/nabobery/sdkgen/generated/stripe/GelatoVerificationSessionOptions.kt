package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class GelatoVerificationSessionOptionsView(
    public val document: GelatoSessionDocumentOptions? = null,
    public val email: GelatoSessionEmailOptions? = null,
    @SerialName("id_number")
    public val idNumber: JsonObject? = null,
    public val matching: GelatoSessionMatchingOptions? = null,
    public val phone: GelatoSessionPhoneOptions? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verification_session_options
 */
@Serializable(with = GelatoVerificationSessionOptions.Serializer::class)
public class GelatoVerificationSessionOptions(
    public val document: GelatoSessionDocumentOptions? = null,
    public val email: GelatoSessionEmailOptions? = null,
    public val idNumber: JsonObject? = null,
    public val matching: GelatoSessionMatchingOptions? = null,
    public val phone: GelatoSessionPhoneOptions? = null,
) {
    public class Builder {
        public var document: GelatoSessionDocumentOptions? = null

        public var email: GelatoSessionEmailOptions? = null

        public var idNumber: JsonObject? = null

        public var matching: GelatoSessionMatchingOptions? = null

        public var phone: GelatoSessionPhoneOptions? = null

        public fun build(): GelatoVerificationSessionOptions =
            GelatoVerificationSessionOptions(
                document = document,
                email = email,
                idNumber = idNumber,
                matching = matching,
                phone = phone,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoVerificationSessionOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoVerificationSessionOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoVerificationSessionOptions {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoVerificationSessionOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoVerificationSessionOptions must be a JSON object")
            return GelatoVerificationSessionOptions(
                document = rawObject["document"]?.let { json.decodeFromJsonElement<GelatoSessionDocumentOptions>(it) },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<GelatoSessionEmailOptions>(it) },
                idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                matching = rawObject["matching"]?.let { json.decodeFromJsonElement<GelatoSessionMatchingOptions>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<GelatoSessionPhoneOptions>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: GelatoVerificationSessionOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoVerificationSessionOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.document?.let { put("document", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", json.encodeToJsonElement(it)) }
                    value.idNumber?.let { put("id_number", json.encodeToJsonElement(it)) }
                    value.matching?.let { put("matching", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoVerificationSessionOptions(
    block: GelatoVerificationSessionOptions.Builder.() -> Unit,
): GelatoVerificationSessionOptions = GelatoVerificationSessionOptions.build(block)
