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
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_requirements_alternative
 */
@Serializable(with = AccountRequirementsAlternative.Serializer::class)
public class AccountRequirementsAlternative(
    alternativeFieldsDue: List<String>,
    originalFieldsDue: List<String>,
) {
    /**
     * Fields that can be provided to resolve all fields in `original_fields_due`.
     */
    public val alternativeFieldsDue: List<String> = alternativeFieldsDue.toList()

    /**
     * Fields that are due and can be resolved by providing all fields in `alternative_fields_due`.
     */
    public val originalFieldsDue: List<String> = originalFieldsDue.toList()

    public class Builder {
        private var alternativeFieldsDueValue: List<String>? = null

        public var alternativeFieldsDue: List<String>
            get() = requireNotNull(alternativeFieldsDueValue) { "alternativeFieldsDue is required" }
            set(`value`) {
                alternativeFieldsDueValue = value
            }

        private var originalFieldsDueValue: List<String>? = null

        public var originalFieldsDue: List<String>
            get() = requireNotNull(originalFieldsDueValue) { "originalFieldsDue is required" }
            set(`value`) {
                originalFieldsDueValue = value
            }

        public fun build(): AccountRequirementsAlternative {
            check(alternativeFieldsDueValue != null) { "alternativeFieldsDue is required" }
            check(originalFieldsDueValue != null) { "originalFieldsDue is required" }
            return AccountRequirementsAlternative(
                alternativeFieldsDue = alternativeFieldsDue,
                originalFieldsDue = originalFieldsDue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): AccountRequirementsAlternative = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AccountRequirementsAlternative> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AccountRequirementsAlternative {
            val jsonDecoder = decoder.requireJsonDecoder("AccountRequirementsAlternative")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("AccountRequirementsAlternative must be a JSON object")
            val alternativeFieldsDue = json.decodeRequired<List<String>>(rawObject, "alternative_fields_due")
            val originalFieldsDue = json.decodeRequired<List<String>>(rawObject, "original_fields_due")
            return AccountRequirementsAlternative(
                alternativeFieldsDue = alternativeFieldsDue,
                originalFieldsDue = originalFieldsDue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AccountRequirementsAlternative,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AccountRequirementsAlternative")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("alternative_fields_due", json.encodeToJsonElement(value.alternativeFieldsDue))
                    put("original_fields_due", json.encodeToJsonElement(value.originalFieldsDue))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun accountRequirementsAlternative(
    block: AccountRequirementsAlternative.Builder.() -> Unit,
): AccountRequirementsAlternative = AccountRequirementsAlternative.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "AccountRequirementsAlternative is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
