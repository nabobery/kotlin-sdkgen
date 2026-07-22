package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingPhysicalBundleView(
    public val features: IssuingPhysicalBundleFeatures,
    public val id: String,
    public val livemode: Boolean,
    public val name: String,
    @SerialName("object")
    public val objectValue: InlineIssuingPhysicalBundleObjectValueX0256369a,
    public val status: InlineIssuingPhysicalBundleStatusX5392f283,
    public val type: InlineIssuingPhysicalBundleTypeX88952cef,
)

/**
 * A Physical Bundle represents the bundle of physical items - card stock, carrier letter, and envelope - that is
 * shipped to a cardholder when you create a physical card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.physical_bundle
 */
@Serializable(with = IssuingPhysicalBundle.Serializer::class)
public class IssuingPhysicalBundle(
    public val features: IssuingPhysicalBundleFeatures,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * Friendly display name.
     */
    public val name: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineIssuingPhysicalBundleObjectValueX0256369a,
    /**
     * Whether this physical bundle can be used to create cards.
     */
    public val status: InlineIssuingPhysicalBundleStatusX5392f283,
    /**
     * Whether this physical bundle is a standard Stripe offering or custom-made for you.
     */
    public val type: InlineIssuingPhysicalBundleTypeX88952cef,
) {
    public class Builder {
        private var featuresValue: IssuingPhysicalBundleFeatures? = null

        public var features: IssuingPhysicalBundleFeatures
            get() = requireNotNull(featuresValue) { "features is required" }
            set(`value`) {
                featuresValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var nameValue: String? = null

        public var name: String
            get() = requireNotNull(nameValue) { "name is required" }
            set(`value`) {
                nameValue = value
            }

        private var objectValueValue: InlineIssuingPhysicalBundleObjectValueX0256369a? = null

        public var objectValue: InlineIssuingPhysicalBundleObjectValueX0256369a
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: InlineIssuingPhysicalBundleStatusX5392f283? = null

        public var status: InlineIssuingPhysicalBundleStatusX5392f283
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var typeValue: InlineIssuingPhysicalBundleTypeX88952cef? = null

        public var type: InlineIssuingPhysicalBundleTypeX88952cef
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): IssuingPhysicalBundle {
            check(featuresValue != null) { "features is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(nameValue != null) { "name is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            check(typeValue != null) { "type is required" }
            return IssuingPhysicalBundle(
                features = features,
                id = id,
                livemode = livemode,
                name = name,
                objectValue = objectValue,
                status = status,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingPhysicalBundle = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingPhysicalBundle> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingPhysicalBundle {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingPhysicalBundle")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingPhysicalBundle must be a JSON object")
            val features = json.decodeRequired<IssuingPhysicalBundleFeatures>(rawObject, "features")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val name = json.decodeRequired<String>(rawObject, "name")
            val objectValue = json.decodeRequired<InlineIssuingPhysicalBundleObjectValueX0256369a>(rawObject, "object")
            val status = json.decodeRequired<InlineIssuingPhysicalBundleStatusX5392f283>(rawObject, "status")
            val type = json.decodeRequired<InlineIssuingPhysicalBundleTypeX88952cef>(rawObject, "type")
            return IssuingPhysicalBundle(
                features = features,
                id = id,
                livemode = livemode,
                name = name,
                objectValue = objectValue,
                status = status,
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingPhysicalBundle,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingPhysicalBundle")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("features", json.encodeToJsonElement(value.features))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("name", value.name)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", json.encodeToJsonElement(value.status))
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingPhysicalBundle(block: IssuingPhysicalBundle.Builder.() -> Unit): IssuingPhysicalBundle =
    IssuingPhysicalBundle.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingPhysicalBundle is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
