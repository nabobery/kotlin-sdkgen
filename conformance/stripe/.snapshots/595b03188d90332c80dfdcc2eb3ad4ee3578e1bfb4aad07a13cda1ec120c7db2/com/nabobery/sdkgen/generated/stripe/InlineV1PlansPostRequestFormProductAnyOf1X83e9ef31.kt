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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * The product whose pricing the created plan will represent. This can either be the ID of an existing product, or a
 * dictionary containing fields used to create a [service product](https://docs.stripe.com/api#product_object-type).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/product/anyOf/0
 */
@Serializable(with = InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31.Serializer::class)
public class InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31(
    public val name: String,
    public val active: Boolean? = null,
    public val id: String? = null,
    public val metadata: Map<String, String>? = null,
    public val statementDescriptor: String? = null,
    public val taxCode: String? = null,
    public val unitLabel: String? = null,
) {
    public class Builder {
        private var nameValue: String? = null

        public var name: String
            get() = requireNotNull(nameValue) { "name is required" }
            set(`value`) {
                nameValue = value
            }

        public var active: Boolean? = null

        public var id: String? = null

        public var metadata: Map<String, String>? = null

        public var statementDescriptor: String? = null

        public var taxCode: String? = null

        public var unitLabel: String? = null

        public fun build(): InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 {
            check(nameValue != null) { "name is required" }
            return InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31(
                name = name,
                active = active,
                id = id,
                metadata = metadata,
                statementDescriptor = statementDescriptor,
                taxCode = taxCode,
                unitLabel = unitLabel,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 must be a JSON object",
                    )
            val name = json.decodeRequired<String>(rawObject, "name")
            return InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31(
                name = name,
                active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
                taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
                unitLabel = rawObject["unit_label"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("name", value.name)
                    value.active?.let { put("active", json.encodeToJsonElement(it)) }
                    value.id?.let { put("id", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                    value.taxCode?.let { put("tax_code", it) }
                    value.unitLabel?.let { put("unit_label", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31(
    block: InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31.Builder.() -> Unit,
): InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 = InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
