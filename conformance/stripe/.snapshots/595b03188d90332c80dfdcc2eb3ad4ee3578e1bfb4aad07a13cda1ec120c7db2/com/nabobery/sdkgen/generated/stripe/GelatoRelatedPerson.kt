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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_related_person
 */
@Serializable(with = GelatoRelatedPerson.Serializer::class)
public class GelatoRelatedPerson(
    /**
     * Token referencing the associated Account of the related Person resource.
     */
    public val account: String,
    /**
     * Token referencing the related Person resource.
     */
    public val person: String,
) {
    public class Builder {
        private var accountValue: String? = null

        public var account: String
            get() = requireNotNull(accountValue) { "account is required" }
            set(`value`) {
                accountValue = value
            }

        private var personValue: String? = null

        public var person: String
            get() = requireNotNull(personValue) { "person is required" }
            set(`value`) {
                personValue = value
            }

        public fun build(): GelatoRelatedPerson {
            check(accountValue != null) { "account is required" }
            check(personValue != null) { "person is required" }
            return GelatoRelatedPerson(
                account = account,
                person = person,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoRelatedPerson = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoRelatedPerson> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoRelatedPerson {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoRelatedPerson")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoRelatedPerson must be a JSON object")
            val account = json.decodeRequired<String>(rawObject, "account")
            val person = json.decodeRequired<String>(rawObject, "person")
            return GelatoRelatedPerson(
                account = account,
                person = person,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: GelatoRelatedPerson,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoRelatedPerson")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account", value.account)
                    put("person", value.person)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoRelatedPerson(block: GelatoRelatedPerson.Builder.() -> Unit): GelatoRelatedPerson =
    GelatoRelatedPerson.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("GelatoRelatedPerson is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
