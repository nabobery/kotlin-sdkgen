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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts~1{id}~1deactivate/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts~1{id}~1deactivate/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1BillingAlertsDeactivatePostRequestFormXa341320a.Serializer::class)
public class InlineV1BillingAlertsDeactivatePostRequestFormXa341320a(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1BillingAlertsDeactivatePostRequestFormXa341320a =
            InlineV1BillingAlertsDeactivatePostRequestFormXa341320a(
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1BillingAlertsDeactivatePostRequestFormXa341320a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingAlertsDeactivatePostRequestFormXa341320a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BillingAlertsDeactivatePostRequestFormXa341320a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingAlertsDeactivatePostRequestFormXa341320a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingAlertsDeactivatePostRequestFormXa341320a must be a JSON object",
                    )
            return InlineV1BillingAlertsDeactivatePostRequestFormXa341320a(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingAlertsDeactivatePostRequestFormXa341320a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingAlertsDeactivatePostRequestFormXa341320a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingAlertsDeactivatePostRequestFormXa341320a(
    block: InlineV1BillingAlertsDeactivatePostRequestFormXa341320a.Builder.() -> Unit,
): InlineV1BillingAlertsDeactivatePostRequestFormXa341320a =
    InlineV1BillingAlertsDeactivatePostRequestFormXa341320a.build(block)
