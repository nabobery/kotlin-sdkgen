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
public data class LegalEntityCompanyVerificationView(
    public val document: LegalEntityCompanyVerificationDocument,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company_verification
 */
@Serializable(with = LegalEntityCompanyVerification.Serializer::class)
public class LegalEntityCompanyVerification(
    public val document: LegalEntityCompanyVerificationDocument,
) {
    public class Builder {
        private var documentValue: LegalEntityCompanyVerificationDocument? = null

        public var document: LegalEntityCompanyVerificationDocument
            get() = requireNotNull(documentValue) { "document is required" }
            set(`value`) {
                documentValue = value
            }

        public fun build(): LegalEntityCompanyVerification {
            check(documentValue != null) { "document is required" }
            return LegalEntityCompanyVerification(
                document = document,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): LegalEntityCompanyVerification = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<LegalEntityCompanyVerification> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): LegalEntityCompanyVerification {
            val jsonDecoder = decoder.requireJsonDecoder("LegalEntityCompanyVerification")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("LegalEntityCompanyVerification must be a JSON object")
            val document = json.decodeRequired<LegalEntityCompanyVerificationDocument>(rawObject, "document")
            return LegalEntityCompanyVerification(
                document = document,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: LegalEntityCompanyVerification,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("LegalEntityCompanyVerification")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("document", json.encodeToJsonElement(value.document))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun legalEntityCompanyVerification(
    block: LegalEntityCompanyVerification.Builder.() -> Unit,
): LegalEntityCompanyVerification = LegalEntityCompanyVerification.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "LegalEntityCompanyVerification is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
