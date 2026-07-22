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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/dob/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/dob/anyOf/0
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab(
    public val day: Int,
    public val month: Int,
    public val year: Int,
) {
    public class Builder {
        private var dayValue: Int? = null

        public var day: Int
            get() = requireNotNull(dayValue) { "day is required" }
            set(`value`) {
                dayValue = value
            }

        private var monthValue: Int? = null

        public var month: Int
            get() = requireNotNull(monthValue) { "month is required" }
            set(`value`) {
                monthValue = value
            }

        private var yearValue: Int? = null

        public var year: Int
            get() = requireNotNull(yearValue) { "year is required" }
            set(`value`) {
                yearValue = value
            }

        public fun build(): InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab {
            check(dayValue != null) { "day is required" }
            check(monthValue != null) { "month is required" }
            check(yearValue != null) { "year is required" }
            return InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab(
                day = day,
                month = month,
                year = year,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab must be a JSON object",
                    )
            val day = json.decodeRequired<Int>(rawObject, "day")
            val month = json.decodeRequired<Int>(rawObject, "month")
            val year = json.decodeRequired<Int>(rawObject, "year")
            return InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab(
                day = day,
                month = month,
                year = year,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("day", json.encodeToJsonElement(value.day))
                    put("month", json.encodeToJsonElement(value.month))
                    put("year", json.encodeToJsonElement(value.year))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab(
    block: InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab =
    InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
