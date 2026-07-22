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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance/properties/offline.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance/properties/offline
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1(
    public val contactEmail: String,
) {
    public class Builder {
        private var contactEmailValue: String? = null

        public var contactEmail: String
            get() = requireNotNull(contactEmailValue) { "contactEmail is required" }
            set(`value`) {
                contactEmailValue = value
            }

        public fun build(): InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1 {
            check(contactEmailValue != null) { "contactEmail is required" }
            return InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1(
                contactEmail = contactEmail,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1 must be a JSON object",
                    )
            val contactEmail = json.decodeRequired<String>(rawObject, "contact_email")
            return InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1(
                contactEmail = contactEmail,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("contact_email", value.contactEmail)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1(
    block: InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1.Builder.() -> Unit,
): InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1 =
    InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
